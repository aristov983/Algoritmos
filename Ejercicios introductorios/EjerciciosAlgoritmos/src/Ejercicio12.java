import java.util.Scanner;


public class Ejercicio12 {
    public void pedirEdad(){
        Scanner s = new Scanner(System.in);
        int edad;
        do { 
            System.out.println("Ingrese una edad entre 0 y 120.");
            edad = s.nextInt();
        } while ((edad<0) || (edad>120));
        System.out.println("Edad válida: "+edad+" anios");
        s.close();
    }
}
