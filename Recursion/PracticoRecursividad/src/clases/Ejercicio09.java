package clases;

public class Ejercicio09 {
    public static int sumaElementosPares(int[] arr, int idx){
        if (idx == arr.length){
            return 0;
        }

        if (arr[idx]%2 == 0){
            return arr[idx] + sumaElementosPares(arr, idx+1);
        }

        return 0 + sumaElementosPares(arr,idx+1);
    }

    public static void ejecutar(){
        Core.headerMessage(9);
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println("Para el arreglo int[] a = {1, 2, 3, 4, 5, 6} la suma de elementos pares es: "+sumaElementosPares(a, 0)); // esperado: 12
        int[] b = {1, 3, 5, 7};
        System.out.println("Para el arreglo int[] b = {1, 3, 5, 7} la suma de elementos pares es: "+sumaElementosPares(b, 0)); // esperado: 0
        Core.footerMessage(9);
    }
}
