package clases;
import java.util.Scanner;

public class Ejercicio08 {
    public static void hanoi(int n, char origen, char destino, char aux){
        if (n==1){
            System.out.println("→ Mover disco "+n+" de "+origen+" a "+destino);
            return;
        }

        System.out.println("→ Mover disco "+(n-1)+" de "+origen+" a "+aux);
        System.out.println("→ Mover disco "+(n)+" de "+origen+" a "+destino);
        System.out.println("→ Mover disco "+(n-1)+" de "+aux+" a "+destino);

        hanoi(n-1, origen, destino, aux);
    }

    public static void ejecutar(Scanner sc){
        Core.headerMessage(8);
        System.out.println("Digite la cantidad de discos que tendrá su torre de hanoi: ");
        hanoi(sc.nextInt(), 'a', 'b','c');
        Core.footerMessage(8);
    }
}
