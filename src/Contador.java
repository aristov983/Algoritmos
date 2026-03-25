public class Contador {
    private static int totalCreados = 0;
    private int numero;

    public static int getTotalCreados(){
        return totalCreados;
    }

    public int getNumero(){
        return this.numero;
    }

    public Contador(){
        totalCreados++;
        numero = totalCreados;
    }
}
