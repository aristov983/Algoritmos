package com.parcial;

public class ListaEnlazada<T> {
    public Nodo<T> inicio;

    public ListaEnlazada(){
        this.inicio=null;
    }

    public void agregarElemento(T dato){
        Nodo<T> nuevoElemento = new Nodo();
        nuevoElemento.dato=dato;
        if (this.inicio==null){
            this.inicio=nuevoElemento;
            return;
        }

        Nodo<T> aux;
        aux = this.inicio;
        while (aux.siguiente!=null) {
            aux = aux.siguiente;
        }
        aux.siguiente = nuevoElemento;
    }

    public void eliminarElemento(T dato){
        if (this.inicio==null){
            return;
        }

        //Si el dato es el primer elemento, dejo el primer elemento sin referencias.
        if (this.inicio.dato == dato){
            this.inicio = this.inicio.siguiente;
            return;
        }

        Nodo<T> aux;
        aux = this.inicio;
        //Mientras el siguiente no sea el dato y el siguiente no sea nulo recorro.
        while (aux.siguiente!=null && aux.siguiente.dato != dato){
            aux = aux.siguiente;
        }
        //Verifico si al terminar de recorrer estoy parado atras del dato, si lo estoy, dejo ese nodo sin referencias.
        if (aux.siguiente!=null && aux.siguiente.dato==dato){
            aux.siguiente = aux.siguiente.siguiente;
            return;
        }
        return;
    }

    @Override
    public String toString(){
        String lista;
        Nodo<T> aux = this.inicio;
        lista = "Lista Enlazada: ";
        while (aux.siguiente!=null) {
            lista = lista+aux.dato + " -> ";
            aux = aux.siguiente;
        }
        return lista;
    }
}
