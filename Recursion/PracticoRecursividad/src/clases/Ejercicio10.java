package clases;
import java.util.Scanner;

public class Ejercicio10 {
    public static void binarias(int n, String actual) {
        if (actual.length() == n){
            System.out.println(actual);
        } else {
            binarias(n, actual+"0");
            binarias(n, actual+"1");
        }
    }

    public static void ejecutar(Scanner sc){
        Core.headerMessage(10);
        System.out.println("Digite el largo de la cadena binaria a imprimir: ");
        int n = sc.nextInt();
        System.out.println("Para el largo digitado, la cadena binaria es: ");
        binarias(n, "");
        Core.footerMessage(10);
    }
}
