package com.problemset03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n=== ProblemSet 03 - Menu ===");
            System.out.println("1. Ejercicio 1 - Preorden");
            System.out.println("2. Ejercicio 2 - Nodos, Hojas y Altura");
            System.out.println("3. Ejercicio 3 - Jerarquia de Empleados");
            System.out.println("4. Ejercicio 4 - Tamano Total de Archivos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                sc.next();
                continue;
            }

            System.out.println();
            switch (opcion) {
                case 1 -> Ejercicios.ejercicio1();
                case 2 -> Ejercicios.ejercicio2();
                case 3 -> Ejercicios.ejercicio3();
                case 4 -> Ejercicios.ejercicio4();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }

        sc.close();
    }
}