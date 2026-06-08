package com.example;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private TrieNodo raiz = new TrieNodo();

    public void insertar(String palabra) {
        TrieNodo nodoActual = raiz;
        for (char c : palabra.toCharArray()) {
            nodoActual.hijos.putIfAbsent(c, new TrieNodo());
            nodoActual = nodoActual.hijos.get(c);
        }
        nodoActual.esPalabra = true;
    }

    public boolean buscar(String palabra) {
        TrieNodo nodoActual = raiz;
        for (char c : palabra.toCharArray()) {
            if (!nodoActual.hijos.containsKey(c)) {
                return false;
            }
            nodoActual = nodoActual.hijos.get(c);
        }
        return nodoActual.esPalabra;
    }
    
    public boolean empiezaCon(String prefijo) {
        TrieNodo nodoActual = raiz;
        for (char c : prefijo.toCharArray()) {
            if (!nodoActual.hijos.containsKey(c)) {
                return false;
            }
            nodoActual = nodoActual.hijos.get(c);
        }
        return true;
    }

    public List<String> autocompletar(String prefijo) {
        List<String> res = new ArrayList<>();
        TrieNodo nodoActual = raiz;
        for (char c : prefijo.toCharArray()) {
            if (!nodoActual.hijos.containsKey(c)) {
                return res;
            }
            nodoActual = nodoActual.hijos.get(c);
        }
        dfs(nodoActual, prefijo, res);
        return res;
    }

    public List<String> listar(){
        List<String> res = new ArrayList<>();
        dfs(raiz, "", res);
        return res;
    }

    private void dfs(TrieNodo nodo, String prefijo, List<String> res) {
        if (nodo.esPalabra) {
            res.add(prefijo);
        }
        for (char c : nodo.hijos.keySet()) {
            dfs(nodo.hijos.get(c), prefijo + c, res);
        }
    }

    
}
