package com.parcial;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        listaSimulator(sc);

        sc.close();
    }

    public static void listaSimulator(Scanner sc) {

        ListaEnlazada<Integer> lista = new ListaEnlazada<>();

        while (true) {

            int opcion;

            System.out.println("\n==== LISTA ENLAZADA SIMULATOR 2026 ====");
            System.out.println("1: Agregar elementos");
            System.out.println("2: Eliminar elementos");
            System.out.println("3: Imprimir lista");
            System.out.println("4: Salir");
            System.out.print("Digite su opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    while (true) {

                        System.out.print("Digite el número a agregar (-1 para salir): ");

                        int numero = sc.nextInt();
                        sc.nextLine();

                        if (numero == -1) {
                            break;
                        }

                        lista.agregarElemento(numero);

                        System.out.println("Elemento agregado.");
                    }

                    break;

                case 2:

                    while (true) {

                        System.out.print("Digite el número a eliminar (-1 para salir): ");

                        int numero = sc.nextInt();
                        sc.nextLine();

                        if (numero == -1) {
                            break;
                        }

                        lista.eliminarElemento(numero);

                        System.out.println("Elemento eliminado.");
                    }

                    break;

                case 3:

                    System.out.println(lista);

                    break;

                case 4:

                    System.out.println("Saliendo...");
                    return;

                default:

                    System.out.println("Opción inválida.");
            }
        }
    }
}