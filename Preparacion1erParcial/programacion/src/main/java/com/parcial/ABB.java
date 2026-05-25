package com.parcial;
public class ABB<T extends Comparable<T>> {
    public NodoArbol<T> raiz;

    public ABB(){
        this.raiz = null;
    }

    public NodoArbol<T> insertar(NodoArbol<T> nodo, T dato){
        
        if (nodo==null){
            return new NodoArbol(dato);
        }

        if (dato.compareTo(nodo.dato) < 0){
            nodo.izquierda = insertar(nodo.izquierda, dato);
        } else {
            if (dato.compareTo(nodo.dato)>0){
                nodo.derecha = insertar(nodo.derecha, dato);
            }
        }

        return nodo;
    }

    public NodoArbol<T> buscar(NodoArbol<T> nodo, T dato){
        if (nodo==null){
            return null;
        }

        if (nodo.dato.equals(dato)){
            return nodo;
        }

        if (dato.compareTo(nodo.dato) < 0){
            return buscar(nodo.izquierda, dato);
        } else {
            if (dato.compareTo(nodo.dato) > 0){
                return buscar(nodo.derecha, dato);
            }
        }

        return nodo;
    }

    public void inorder(NodoArbol<T> nodo){
        if(nodo != null){

            inorder(nodo.izquierda);

            System.out.println(nodo.dato);

            inorder(nodo.derecha);
        }
    } 

    public int altura(){
    return alturaRecursiva(raiz);
}

    private int alturaRecursiva(NodoArbol<T> nodo){

        if(nodo == null){
            return -1;
        }

        int alturaIzquierda = alturaRecursiva(nodo.izquierda);
        int alturaDerecha = alturaRecursiva(nodo.derecha);

        return 1 + Math.max(alturaIzquierda, alturaDerecha);
    }

    public void eliminar(T dato){
        raiz = eliminarRecursivo(raiz, dato);
    }

    private T obtenerMinimo(NodoArbol<T> nodo){

    while(nodo.izquierda != null){
        nodo = nodo.izquierda;
    }

    return nodo.dato;
}

    private NodoArbol<T> eliminarRecursivo(NodoArbol<T> nodo, T dato){

        if(nodo == null){
            return null;
        }

        // BUSCAR
        if(dato.compareTo(nodo.dato) < 0){

            nodo.izquierda = eliminarRecursivo(nodo.izquierda, dato);

        } else if(dato.compareTo(nodo.dato) > 0){

            nodo.derecha = eliminarRecursivo(nodo.derecha, dato);

        } else {

            // CASO 1: sin hijos
            if(nodo.izquierda == null && nodo.derecha == null){
                return null;
            }

            // CASO 2: un hijo
            if(nodo.izquierda == null){
                return nodo.derecha;
            }

            if(nodo.derecha == null){
                return nodo.izquierda;
            }

            // CASO 3: dos hijos

            T minimo = obtenerMinimo(nodo.derecha);

            nodo.dato = minimo;

            nodo.derecha = eliminarRecursivo(nodo.derecha, minimo);
        }

        return nodo;
    }
}
