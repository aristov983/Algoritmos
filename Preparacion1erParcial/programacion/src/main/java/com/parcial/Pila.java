package com.parcial;

public class Pila<T extends Comparable<T>> {
    private Nodo<T> tope;
    private int tamaño;

    public Pila() {
        this.tope = null;
        this.tamaño = 0;
    }

    /**
     * Agrega un elemento al tope de la pila
     * @param dato el elemento a agregar
     */
    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        
        if (!estaVacia()) {
            nuevoNodo.setDerecha(this.tope);
        }
        this.tope = nuevoNodo;
        this.tamaño++;
    }

    /**
     * Remueve y retorna el elemento del tope de la pila
     * @return el elemento removido
     * @throws RuntimeException si la pila está vacía
     */
    public T pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        
        T dato = this.tope.getDato();
        this.tope = this.tope.getDerecha();
        this.tamaño--;
        
        return dato;
    }

    /**
     * Retorna el elemento del tope sin removerlo
     * @return el elemento del tope
     * @throws RuntimeException si la pila está vacía
     */
    public T peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return this.tope.getDato();
    }

    /**
     * Verifica si la pila está vacía
     * @return true si está vacía, false en caso contrario
     */
    public boolean estaVacia() {
        return this.tamaño == 0;
    }

    /**
     * Retorna el número de elementos en la pila
     * @return el tamaño de la pila
     */
    public int getTamaño() {
        return this.tamaño;
    }

    /**
     * Vacía la pila removiendo todos los elementos
     */
    public void vaciar() {
        this.tope = null;
        this.tamaño = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pila [");
        Nodo<T> actual = this.tope;
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
