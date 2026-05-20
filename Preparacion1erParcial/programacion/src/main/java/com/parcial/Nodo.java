package com.parcial;

public class Nodo<T extends Comparable<T>> {
    public T dato;
    private Nodo<T> izquierda;
    private Nodo<T> derecha;
    private int altura;

    public Nodo<T> getIzquierda(){
        return this.izquierda;
    }

    public void setIzquierda(Nodo<T> nodo){
        this.izquierda = nodo;
    }

    public Nodo<T> getDerecha(){
        return this.derecha;
    }

    public int getAltura(){
        return this.altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public void setDerecha(Nodo<T> nodo){
        this.derecha = nodo;
    }

    public T getDato(){
        return this.dato;
    }

    public Nodo(T dato){
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
        this.altura = 1;
    }
}
