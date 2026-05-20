package com.parcial;

public class Cola<T extends Comparable<T>> {
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int tamaño;

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.tamaño = 0;
    }

    /**
     * Agrega un elemento al final de la cola
     * @param dato el elemento a agregar
     */
    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        
        if (estaVacia()) {
            this.inicio = nuevoNodo;
        } else {
            this.fin.setDerecha(nuevoNodo);
        }
        this.fin = nuevoNodo;
        this.tamaño++;
    }

    /**
     * Remueve y retorna el primer elemento de la cola
     * @return el elemento removido
     * @throws RuntimeException si la cola está vacía
     */
    public T desencolar() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        
        T dato = this.inicio.getDato();
        this.inicio = this.inicio.getDerecha();
        this.tamaño--;
        
        if (estaVacia()) {
            this.fin = null;
        }
        return dato;
    }

    /**
     * Retorna el primer elemento sin removerlo
     * @return el primer elemento
     * @throws RuntimeException si la cola está vacía
     */
    public T frente() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        return this.inicio.getDato();
    }

    /**
     * Verifica si la cola está vacía
     * @return true si está vacía, false en caso contrario
     */
    public boolean estaVacia() {
        return this.tamaño == 0;
    }

    /**
     * Retorna el número de elementos en la cola
     * @return el tamaño de la cola
     */
    public int getTamaño() {
        return this.tamaño;
    }

    /**
     * Vacía la cola removiendo todos los elementos
     */
    public void vaciar() {
        this.inicio = null;
        this.fin = null;
        this.tamaño = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cola [");
        Nodo<T> actual = this.inicio;
        while (actual != null) {
            sb.append(actual.getDato());
            actual = actual.getDerecha();
            if (actual != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
