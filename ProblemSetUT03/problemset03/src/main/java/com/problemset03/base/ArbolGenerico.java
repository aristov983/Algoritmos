package com.problemset03.base;

import java.util.Queue;
import java.util.LinkedList;


public class ArbolGenerico<T> {
    //Atributos
    private NodoGenerico<T> raiz;

    public ArbolGenerico(NodoGenerico<T> raiz){
        this.raiz = raiz;
    }

    //Metodos genericos.
    public String preorden(){
        StringBuilder sb = new StringBuilder();
        if (raiz!=null){
            raiz.preorden(sb);
        }
        return sb.toString().trim();
    }

    public int contarNodos() {
    if (raiz == null) {
        return 0;
    }
        return raiz.contarNodos();
    }

    public int contarHojas() {
        if (raiz == null) {
            return 0;
        }
        return raiz.contarHojas();
    }

    public int altura() {
        if (raiz == null) {
            return -1;
        }
        return raiz.altura();
    }

    public String porNiveles(){
        StringBuilder sb = new StringBuilder();
        Queue<NodoGenerico<T>> cola = new LinkedList<NodoGenerico<T>>();
        if (raiz != null) cola.offer(raiz);
        while (!cola.isEmpty()){
            NodoGenerico<T> actual = cola.poll();
            sb.append(actual.getDato()).append(" ");
            NodoGenerico hijo = actual.getPrimerHijo();
            while (hijo!=null){
                cola.offer(hijo);
                hijo=hijo.getHemandoDerecho();
            }
        }
        return sb.toString().trim();
    }

    public String auxImprimirJerarquia(int altura){
        if (altura!=0 && this.raiz!=null){
            StringBuilder sb = new StringBuilder();
            sb.append(raiz.getDato()+"\n|\n");
            return imprimirJerarquia(altura-1, sb, raiz.getPrimerHijo());
        }
        return " ";
    }

    public String imprimirJerarquia(int altura, StringBuilder sb, NodoGenerico<T> nodo){
        if (altura>=0 && nodo!=null){
            sb.append(nodo.getDato());
            NodoGenerico<T> actual = nodo.getHemandoDerecho();
            while (actual!=null){
                sb.append(" - " + actual.getDato());
                actual = actual.getHemandoDerecho();
            }
            if (altura>0) sb.append("\n|\n");
            return imprimirJerarquia(altura-1, sb, nodo.getPrimerHijo());
        }
        return sb.toString().trim();
    }
}
