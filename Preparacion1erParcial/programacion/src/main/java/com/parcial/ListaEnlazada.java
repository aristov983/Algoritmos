package com.parcial;

public class ListaEnlazada<T extends Comparable<T>> {
    private Nodo<T> cabeza;
    private int tamaño;

    public ListaEnlazada() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    /**
     * Agrega un elemento al final de la lista
     * @param dato el elemento a agregar
     */
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        
        if (estaVacia()) {
            this.cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = this.cabeza;
            while (actual.getDerecha() != null) {
                actual = actual.getDerecha();
            }
            actual.setDerecha(nuevoNodo);
        }
        this.tamaño++;
    }

    /**
     * Agrega un elemento al inicio de la lista
     * @param dato el elemento a agregar
     */
    public void agregarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.setDerecha(this.cabeza);
        this.cabeza = nuevoNodo;
        this.tamaño++;
    }

    /**
     * Agrega un elemento en una posición específica (0-indexado)
     * @param posicion la posición donde agregar
     * @param dato el elemento a agregar
     * @throws IndexOutOfBoundsException si la posición es inválida
     */
    public void agregarEnPosicion(int posicion, T dato) {
        if (posicion < 0 || posicion > this.tamaño) {
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        }
        
        if (posicion == 0) {
            agregarAlInicio(dato);
            return;
        }
        
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        Nodo<T> actual = this.cabeza;
        
        for (int i = 0; i < posicion - 1; i++) {
            actual = actual.getDerecha();
        }
        
        nuevoNodo.setDerecha(actual.getDerecha());
        actual.setDerecha(nuevoNodo);
        this.tamaño++;
    }

    /**
     * Obtiene el elemento en una posición específica
     * @param posicion la posición del elemento (0-indexado)
     * @return el elemento en la posición
     * @throws IndexOutOfBoundsException si la posición es inválida
     */
    public T obtener(int posicion) {
        if (posicion < 0 || posicion >= this.tamaño) {
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        }
        
        Nodo<T> actual = this.cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getDerecha();
        }
        return actual.getDato();
    }

    /**
     * Elimina el elemento en una posición específica
     * @param posicion la posición del elemento a eliminar (0-indexado)
     * @return el elemento eliminado
     * @throws IndexOutOfBoundsException si la posición es inválida
     */
    public T eliminar(int posicion) {
        if (posicion < 0 || posicion >= this.tamaño) {
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        }
        
        T dato;
        
        if (posicion == 0) {
            dato = this.cabeza.getDato();
            this.cabeza = this.cabeza.getDerecha();
        } else {
            Nodo<T> actual = this.cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.getDerecha();
            }
            dato = actual.getDerecha().getDato();
            actual.setDerecha(actual.getDerecha().getDerecha());
        }
        
        this.tamaño--;
        return dato;
    }

    /**
     * Busca un elemento en la lista
     * @param dato el elemento a buscar
     * @return la posición del elemento, o -1 si no se encuentra
     */
    public int buscar(T dato) {
        Nodo<T> actual = this.cabeza;
        int posicion = 0;
        
        while (actual != null) {
            if (actual.getDato().compareTo(dato) == 0) {
                return posicion;
            }
            actual = actual.getDerecha();
            posicion++;
        }
        return -1;
    }

    /**
     * Verifica si la lista contiene un elemento
     * @param dato el elemento a buscar
     * @return true si lo contiene, false en caso contrario
     */
    public boolean contiene(T dato) {
        return buscar(dato) != -1;
    }

    /**
     * Verifica si la lista está vacía
     * @return true si está vacía, false en caso contrario
     */
    public boolean estaVacia() {
        return this.tamaño == 0;
    }

    /**
     * Retorna el número de elementos en la lista
     * @return el tamaño de la lista
     */
    public int getTamaño() {
        return this.tamaño;
    }

    /**
     * Vacía la lista removiendo todos los elementos
     */
    public void vaciar() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ListaEnlazada [");
        Nodo<T> actual = this.cabeza;
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
