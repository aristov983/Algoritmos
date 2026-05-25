package com.parcial;

public class NodoArbol<T extends Comparable<T>> {
    public T dato;
    public NodoArbol<T> izquierda;
    public NodoArbol<T> derecha;

    public NodoArbol(T dato){
        this.izquierda = null;
        this.derecha = null;
        this.dato = dato;
    }
}
