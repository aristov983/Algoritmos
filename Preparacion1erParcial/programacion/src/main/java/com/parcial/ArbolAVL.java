package com.parcial;

public class ArbolAVL<T extends Comparable<T>> {
    private Nodo<T> raiz;

    private int altura(Nodo<T> nodo){
        if (nodo == null){
            return 0;
        }
        return nodo.getAltura();
    }

    private int balance(Nodo<T> nodo){
        if (nodo==null){
            return 0;
        }
        return altura(nodo.getIzquierda()) - altura(nodo.getDerecha());
    }

    //ROTACION DERECHA
    private Nodo<T> rotarDerecha(Nodo<T> nodo){

        Nodo<T> x = nodo.getIzquierda();
        Nodo<T> y = x.getDerecha();

        //Rotar
        x.setDerecha(nodo);
        nodo.setIzquierda(y);

        //Actualizar alturas
        nodo.setAltura(Math.max(altura(nodo.getIzquierda()), altura(nodo.getDerecha()))+1);

        x.setAltura(Math.max(altura(x.getIzquierda()), altura(x.getDerecha()))+1);

        return x;
    }

    //ROTACION IZQUIERDA
    private Nodo<T> rotarIzquierda(Nodo<T> nodo){
        Nodo<T> x = nodo.getDerecha();
        Nodo<T> y = x.getIzquierda();

        //Rotar
        x.setIzquierda(nodo);
        nodo.setDerecha(y);

        //Actualizar alturas
        nodo.setAltura(Math.max(altura(nodo.getIzquierda()), altura(nodo.getDerecha()))+1);
        x.setAltura(Math.max(altura(x.getIzquierda()), altura(x.getDerecha()))+1);

        return x;
    }

    //INSERTAR (DOS METODOS)
    public void insertar(T dato){
        raiz = insertar(raiz, dato);
    }

    private Nodo<T> insertar(Nodo<T> nodo, T dato){

        if (nodo == null){
            return new Nodo<>(dato);
        }

        if (dato.compareTo(nodo.getDato()) < 0) {
            nodo.setIzquierda(insertar(nodo.getIzquierda(), dato));
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            nodo.setDerecha(insertar(nodo.getDerecha(), dato));
        } else {
            return nodo;
        }

        //Actualizar altura
        nodo.setAltura(Math.max(altura(nodo.getIzquierda()), altura(nodo.getDerecha()))+1);

        // === CHECKEO BALANCE Y CORRIGO ===
        int balance = balance(nodo);

        //LL
        if (balance > 1 && dato.compareTo(nodo.getIzquierda().getDato())<0){
            return rotarDerecha(nodo);
        }

        //RR
        if (balance<-1 && dato.compareTo(nodo.getDerecha().getDato())>0){
            return rotarIzquierda(nodo);
        }

        //LR

        if (balance>1 && dato.compareTo(nodo.getIzquierda().getDato())>0){
            nodo.setIzquierda(rotarIzquierda(nodo.getIzquierda()));

            return rotarDerecha(nodo);
        }

        //RL
        if (balance<-1 && dato.compareTo(nodo.getDerecha().getDato())<0){
            nodo.setDerecha(rotarDerecha(nodo.getDerecha()));

            return rotarIzquierda(nodo);
        }

        return nodo;
    }

}
