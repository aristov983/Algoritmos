package com.problemset03.base;

public class NodoGenerico<T> {

    //Atributos
    private T dato;
    private NodoGenerico<T> primerHijo;
    private NodoGenerico<T> hermanoDerecho;

    public NodoGenerico(T dato){
        this.dato = dato;
    }
    //Getters-Setters
    public T getDato(){
        return this.dato;
    }

    public NodoGenerico<T> getPrimerHijo(){
        return this.primerHijo;
    }

    public NodoGenerico<T> getHemandoDerecho(){
        return this.hermanoDerecho;
    }

    //Metodos Generales

    public void agregarHijo(NodoGenerico<T> hijo){
        if (primerHijo == null){
            primerHijo = hijo;
        } else {
            NodoGenerico<T> actual = primerHijo;
            while (actual.hermanoDerecho != null){
                actual = actual.hermanoDerecho;
            }
            actual.hermanoDerecho = hijo;
        }
    }
    
    public void preorden(StringBuilder sb){
        sb.append(dato).append(" ");
        NodoGenerico<T> hijo = primerHijo;
        while (hijo != null){
            hijo.preorden(sb);
            hijo = hijo.hermanoDerecho;
        }
    }

    //cuenta todos los nodos del subárbol cuya raíz es este nodo
    public int contarNodos() {
        int cantidad = 1; // me cuento a mí mismo

        NodoGenerico<T> hijo = primerHijo;
        while (hijo != null) {
            cantidad += hijo.contarNodos();
            hijo = hijo.hermanoDerecho;
        }

        return cantidad;
    }

    //cuenta las hojas del subárbol
    public int contarHojas() {
        if (primerHijo == null) {
            return 1;
        }

        int hojas = 0;
        NodoGenerico<T> hijo = primerHijo;

        while (hijo != null) {
            hojas += hijo.contarHojas();
            hijo = hijo.hermanoDerecho;
        }

        return hojas;
    }

    //altura del subárbol
    public int altura() {
        if (primerHijo == null) {
            return 0;
        }

        int alturaMaxima = 0;
        NodoGenerico<T> hijo = primerHijo;

        while (hijo != null) {
            alturaMaxima = Math.max(alturaMaxima, hijo.altura());
            hijo = hijo.hermanoDerecho;
        }

        return alturaMaxima + 1;
    }

}
