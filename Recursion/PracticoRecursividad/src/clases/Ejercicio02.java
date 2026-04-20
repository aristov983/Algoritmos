package clases;
import java.util.Scanner;
public class Ejercicio02 {
    public static String invertir(String s){
        if (s.isEmpty()){
            return " ";
        }

        return (invertir(s.substring((1))) + s.charAt(0));
    }

    public static void ejecutar(Scanner sc){
        Core.headerMessage(2);
        System.out.println("Ingrese una palabra para invertirla: ");
        System.out.println("La palabra invertida es: "+invertir(sc.nextLine()));
        Core.footerMessage(2);
    }
}
