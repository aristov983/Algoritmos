import clases.Ejercicio01;
import clases.Ejercicio02;
import clases.Ejercicio03;
import clases.Ejercicio04;
import clases.Ejercicio05;
import clases.Ejercicio06;
import clases.Ejercicio07;
import clases.Ejercicio08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("=================================================================================");
            System.out.println("Digitá un numero 1-10 para ejecutar el ejercicio correspondiente o 0 para salir.");
            System.out.println("=================================================================================");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    Ejercicio01.ejecutar(sc);
                    break;
                case 2:
                    Ejercicio02.ejecutar(sc);
                    break;
                case 3:
                    Ejercicio03.ejecutar();
                    break;
                case 4:
                    Ejercicio04.ejecutar(sc);
                    break;
                case 5:
                    Ejercicio05.ejecutar();
                    break;
                case 6:
                    Ejercicio06.ejecutar(sc);
                    break;
                case 7:
                    Ejercicio07.ejecutar(sc);
                    break;
                case 8:
                    Ejercicio08.ejecutar(sc);
                    break;
                case 9:
                    //ejercicio
                case 10:
                    //ejercicio
                case 0:
                    sc.close();
                    System.out.println("==========");
                    System.out.println("  ADIÓS  ");
                    System.out.println("==========");
                    return;
            }
        } while (true);
    }
}

