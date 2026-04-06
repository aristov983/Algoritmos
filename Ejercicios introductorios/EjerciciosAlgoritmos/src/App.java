import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("El maximo de 1,2,3 es: "+maximo(1,2,3));
        //Ejercicio12 e12 = new Ejercicio12();
        //e12.pedirEdad();
        //Ejercicio13 e13 = new Ejercicio13();
        //int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}}; lo dejo comentado porque me gusta mas declarar la variable en el momento
        //e13.sumarFilas(new int[][] {{1,2,3},{2,3,4},{5,6,8}});
        //System.out.println("El factorial de 5 es: "+factorial(5));
        //Ejercicio15 e15 = new Ejercicio15();
        //e15.ejercicio15();
        System.out.println("Por busqueda binaria: "+busquedaBinaria(new int[] {0,1,2,3,4,5,6,7,8,9},5));
        System.out.println("Por busqueda lineal: "+busquedaLineal(new int[] {0,1,2,3,4,5,6,7,8,9}, 3));
        leerCalcularDiv100();
    }

    public static int maximo(int a, int b, int c){
        int max = a;
        if (b>max && b>c){
            max=b;
        } else{
            if (c>max && c>b){
                max=c;
            }   
        }
        return max;
    }

    /* public static long factorial(int n){
        int factDeN = 1;
        while (n!=1){
            factDeN = factDeN*n;
            n=n-1;
        }
        return factDeN;
    } */

    //Ejercicio 14
    public static long factorial(int n){
        if (n==0) return 1;
        return n * factorial(n-1);
    }

    //Ejercicio 16
    public static int busquedaLineal(int[] arr, int target){
        for (int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        System.out.println("No se encontró el elemento, devolviendo -1 ...");
        return -1;
    }

    //Ejercicio 16
    public static int busquedaBinaria(int[] arr, int target){
        int left=0, right=arr.length - 1;
        while (left<=right){
            int medio = left + (right - left) / 2;
            
            if (arr[medio]==target){
                return medio;
            }
            if (arr[medio]>target){
                right=medio-1;
            } else {
                if (arr[medio]<target){
                    left=medio+1;
                }
            }
        }
        return -1;
    }

    //ejercicio17
    public static void leerCalcularDiv100(){
        Scanner s = new Scanner(System.in);
        while (true) {  
            try {
            System.out.print("Ingrese un número entero: ");
            int entrada = s.nextInt();
            System.out.println(100 / entrada);
            break;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0.");
        } catch (InputMismatchException e){
            System.out.println("Error: debe ingresar un número entero.");
        } finally {
            //nada
        }
        }
        s.close();
        
    }
}
