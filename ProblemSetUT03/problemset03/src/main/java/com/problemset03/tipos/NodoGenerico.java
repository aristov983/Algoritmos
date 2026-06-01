package com.problemset03.tipos;

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
}
