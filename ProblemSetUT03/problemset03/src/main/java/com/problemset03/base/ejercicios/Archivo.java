package com.problemset03.base.ejercicios;

public class Archivo {
    private String nombre;
    private int tamanio; // KB

    public Archivo(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}