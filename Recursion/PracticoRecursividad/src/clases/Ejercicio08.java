package clases;
import java.util.Scanner;

public class Ejercicio08 {
    public static void hanoi(int n, char origen, char destino, char aux){
        if (n==1){
            System.out.println("→ Mover disco "+n+" de "+origen+" a "+destino);
        }

        System.out.println("→ Mover disco "+(n-1)+" de "+origen+" a "+aux);
        System.out.println("→ Mover disco "+(n)+" de "+origen+" a "+destino);
        System.out.println("→ Mover disco "+(n-1)+" de "+aux+" a "+destino);
    }
}
