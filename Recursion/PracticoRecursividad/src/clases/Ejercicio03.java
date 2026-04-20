package clases;

public class Ejercicio03 {
    public static int contarOcurrencias(int[] arr, int x, int idx) {
        int suma=0;

        if (idx==arr.length){
            return 0;
        }

        if (arr[idx]==x){
            suma=1;
        }

        return suma+contarOcurrencias(arr, x, idx+1);
    }

    public static void ejecutar(){
        Core.headerMessage(3);
        int[] a = {3, 1, 4, 1, 5, 9, 2, 1};
        System.out.println(contarOcurrencias(a, 1, 0)); // esperado: 3
        System.out.println(contarOcurrencias(a, 7, 0)); // esperado: 0
        Core.footerMessage(3);
    }
}
