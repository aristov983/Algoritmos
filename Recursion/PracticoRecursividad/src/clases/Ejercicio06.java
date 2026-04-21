package clases;

import java.util.Scanner;

public class Ejercicio06 {
    public static int multiplicar(int a, int b){
        if (b==0){
            return 0;
        }

        return (a+multiplicar(a,b-1));
    }

    public static void ejecutar(Scanner sc){
        Core.headerMessage(6);
        System.out.println("Ingrese el primer número a multiplicar: ");
        int a = sc.nextInt();
        System.out.println("Ingrese por cuanto lo quiere multiplicar: ");
        int b = sc.nextInt();
        System.out.println("El resultado de "+a+"*"+b+" es: "+multiplicar(a, b));
        Core.footerMessage(6);
    }
}

