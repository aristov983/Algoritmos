package com.parcial;

public class Nodo<T> {
    public T dato;
    public Nodo<T> siguiente;

    public Nodo(){
        this.dato = null;
        this.siguiente = null;
    }
}
