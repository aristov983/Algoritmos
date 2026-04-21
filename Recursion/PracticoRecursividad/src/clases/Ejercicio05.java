package clases;

import java.math.*;

public class Ejercicio05 {
    public static int maximo(int[] arr, int idx){
        if (idx == arr.length-1){ //idx empieza en 0, cuando idx=arr.length-1 ya estamos en la anteultima posición del arreglo
            return arr[0];
        }

        return Math.max(arr[idx], maximo(arr, idx+1));
    }

    public static void ejecutar(){
        Core.headerMessage(5);
        int[] a = {3, 7, 1, 9, 4, 2};
        System.out.println("El máximo del arreglo a = {3, 7, 1, 9, 4, 2} es: "+maximo(a, 0)); // esperado: 9
        int[] b = {-5, -2, -8}; 
        System.out.println("El máximo del arreglo b = {-5, -2, -8} es: "+maximo(b, 0)); // esperado: -2
        Core.footerMessage(5);
    }
}
