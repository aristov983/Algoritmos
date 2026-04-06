import java.util.Arrays;

public class Ejercicio13 {
    public void sumarFilas(int[][] matriz){
        //por cada fila en la matriz
        for (int[] fila: matriz){
            int suma = 0;
            //por cada elemento en la fila
            for (int valor: fila){
                suma+=valor;
            }
            System.out.println("La suma de la fila "+Arrays.toString(fila)+" es "+suma);  
        }
    }
}
