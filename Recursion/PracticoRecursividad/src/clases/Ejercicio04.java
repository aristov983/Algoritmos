package clases;
import java.util.Scanner;

public class Ejercicio04 {
    public static boolean esPalindromo(String s){
        if (s.isEmpty() || s.length() == 1){
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }

        return esPalindromo(s.substring(1, s.length()-1));
    }

    public static void ejecutar(Scanner sc){
        Core.headerMessage(4);
        System.out.println("Ingrese una palabra para saber si es palindromo: ");
        if (esPalindromo(sc.nextLine())){
            System.out.println("¡Es palindromo!");
        }
        else {
            System.out.println("No es palindromo...");
        }
        Core.footerMessage(4);
    }
}
