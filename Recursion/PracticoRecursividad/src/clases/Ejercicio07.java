package clases;
import java.util.Scanner;

public class Ejercicio07 {
    public static int digitosPares(int n){
        if (n<10){
            if (n%2 == 0){
                return 1;
            } else {
                return 0;
            }
        }

        if ((n%10)%2 == 0){
            return 1 + digitosPares(n/10);
        }

        return digitosPares(n/10);
    }

    public static void ejecutar(Scanner sc){
        Core.headerMessage(7);
        
        System.out.println("Ingrese un número para saber cuantos de sus digitos son pares o no: ");
        System.out.println("La cantidad de números pares son: "+digitosPares(sc.nextInt()));

        Core.footerMessage(7);
    }
}

