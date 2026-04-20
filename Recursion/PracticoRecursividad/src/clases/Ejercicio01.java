package clases;
import java.util.Scanner;

public class Ejercicio01 {
    public static int  sumaDigitos(int n){
        if (n<=0){
            return 0;
        }

        return n+sumaDigitos(n-1);
    }

    public static void ejecutar(Scanner sc){
        Core.headerMessage(1);
        System.out.println("Digite un número para calcular la suma desde ese número hasta 1: ");
        System.out.println("La suma desde ese número hasta 1 es: " + sumaDigitos(sc.nextInt()));
        Core.footerMessage(1);
    }
}
