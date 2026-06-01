package com.problemset03.tipos;

public class ArbolGenerico<T> {
    private NodoGenerico<T> raiz;

    public ArbolGenerico(NodoGenerico<T> raiz){
        this.raiz = raiz;
    }

    public String preorden(){
        StringBuilder sb = new StringBuilder();
        if (raiz!=null){
            raiz.preorden(sb);
        }
        return sb.toString().trim();
    }
}
