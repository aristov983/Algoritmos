package com.problemset03;

import com.problemset03.base.ArbolGenerico;
import com.problemset03.base.NodoGenerico;
import com.problemset03.base.ejercicios.Archivo;
import com.problemset03.base.ejercicios.Empleado;

public class Ejercicios {

    public static void ejercicio1() {
        System.out.println("=== Ejercicio 1 ===");

        NodoGenerico<String> a = new NodoGenerico<>("A");
        NodoGenerico<String> b = new NodoGenerico<>("B");
        NodoGenerico<String> c = new NodoGenerico<>("C");
        NodoGenerico<String> d = new NodoGenerico<>("D");
        NodoGenerico<String> e = new NodoGenerico<>("E");
        NodoGenerico<String> f = new NodoGenerico<>("F");
        NodoGenerico<String> g = new NodoGenerico<>("G");

        a.agregarHijo(b);
        a.agregarHijo(c);
        a.agregarHijo(d);

        b.agregarHijo(e);

        d.agregarHijo(f);
        d.agregarHijo(g);

        ArbolGenerico<String> arbol = new ArbolGenerico<>(a);

        System.out.println("Preorden: " + arbol.preorden());
    }

    public static void ejercicio2() {
        System.out.println("=== Ejercicio 2 ===");

        NodoGenerico<String> a = new NodoGenerico<>("A");
        NodoGenerico<String> b = new NodoGenerico<>("B");
        NodoGenerico<String> c = new NodoGenerico<>("C");
        NodoGenerico<String> d = new NodoGenerico<>("D");
        NodoGenerico<String> e = new NodoGenerico<>("E");
        NodoGenerico<String> f = new NodoGenerico<>("F");
        NodoGenerico<String> g = new NodoGenerico<>("G");

        a.agregarHijo(b);
        a.agregarHijo(c);
        a.agregarHijo(d);

        b.agregarHijo(e);
        b.agregarHijo(f);

        d.agregarHijo(g);

        ArbolGenerico<String> arbol = new ArbolGenerico<>(a);

        System.out.println("Preorden: " + arbol.preorden());
        System.out.println("Nodos: " + arbol.contarNodos());
        System.out.println("Hojas: " + arbol.contarHojas());
        System.out.println("Altura: " + arbol.altura());
    }

    public static void ejercicio3() {
        System.out.println("=== Ejercicio 3 ===");

        NodoGenerico<Empleado> e1 = new NodoGenerico<>(new Empleado("Joe Done", "Empleado a cargo"));
        NodoGenerico<Empleado> e2 = new NodoGenerico<>(new Empleado("Jane Dane", "Empleado a cargo"));
        NodoGenerico<Empleado> e3 = new NodoGenerico<>(new Empleado("June Dune", "Empleado a cargo"));

        NodoGenerico<Empleado> j1 = new NodoGenerico<>(new Empleado("Martin Martinez", "Jefe de area"));
        NodoGenerico<Empleado> j2 = new NodoGenerico<>(new Empleado("Fernando Fernandez", "Jefe de area"));

        NodoGenerico<Empleado> g1 = new NodoGenerico<>(new Empleado("Emmanuel Aristov", "Gerente general"));

        g1.agregarHijo(j1);
        g1.agregarHijo(j2);

        j1.agregarHijo(e1);
        j1.agregarHijo(e2);
        j2.agregarHijo(e3);

        ArbolGenerico<Empleado> arbol = new ArbolGenerico<>(g1);

        System.out.println(arbol.auxImprimirJerarquia(arbol.altura()) + "\n");
        System.out.println("El empleado Martin Martinez tiene " + arbol.contarSubordinados("Martin Martinez") + " subordinados.");
    }

    public static void ejercicio4() {
        System.out.println("=== Ejercicio 4 ===");

        NodoGenerico<Archivo> aed2     = new NodoGenerico<>(new Archivo("aed2", 0));
        NodoGenerico<Archivo> trabajos = new NodoGenerico<>(new Archivo("trabajos", 0));
        NodoGenerico<Archivo> programas = new NodoGenerico<>(new Archivo("programas", 0));
        NodoGenerico<Archivo> h1       = new NodoGenerico<>(new Archivo("h1.doc", 3));
        NodoGenerico<Archivo> h2       = new NodoGenerico<>(new Archivo("h2.doc", 2));
        NodoGenerico<Archivo> robot    = new NodoGenerico<>(new Archivo("Robot.java", 20));
        NodoGenerico<Archivo> stocks   = new NodoGenerico<>(new Archivo("Stocks.java", 25));

        aed2.agregarHijo(trabajos);
        aed2.agregarHijo(programas);

        trabajos.agregarHijo(h1);
        trabajos.agregarHijo(h2);

        programas.agregarHijo(robot);
        programas.agregarHijo(stocks);

        ArbolGenerico<Archivo> arbol = new ArbolGenerico<>(aed2);

        System.out.println("Tamano total: " + arbol.tamanioTotal() + " KB");
    }
}
