package com.parcial;

public class Cola<T> {
    public Nodo<T> primero;
    public Nodo<T> ultimo;


    public Cola(){
        this.primero=null;
        this.ultimo=null;
    }

    public void encolar(T elemento){
        Nodo<T> nuevoElemento = new Nodo();
        nuevoElemento.dato = elemento;
        if (this.primero==null){
            this.primero = nuevoElemento;
            this.ultimo = nuevoElemento;
        } else {
            ultimo.siguiente = nuevoElemento;
            ultimo = nuevoElemento;
        }
    }

    public T desencolar(){
        if (primero == null){
            return null;
        }

        T dato = primero.dato;
        primero = primero.siguiente;
        

        if (primero == null){   
            ultimo = null;
        }
        
        return dato;
    }

    @Override
    public String toString() {

        Nodo<T> aux = primero;

        String texto = "";

        while (aux != null) {
            texto += aux.dato + " -> ";
            aux = aux.siguiente;
        }

        texto += "null";

        return texto;
    }
}
