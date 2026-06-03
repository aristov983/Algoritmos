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

    public void auxImprimirJerarquia(int altura){
        StringBuilder sb = new StringBuilder();
        imprimirJerarquia(altura, sb);
    }

    //Implementar
    //TODO: TODO TODO TODO TODO TODO TODO TODO TODO
    public void imprimirJerarquia(int altura, StringBuilder sb){
        if (altura!=0){
            imprimirJerarquia(altura-1, sb);
        }
    }
}
