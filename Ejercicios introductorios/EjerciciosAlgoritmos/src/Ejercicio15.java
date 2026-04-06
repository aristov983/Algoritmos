import java.util.ArrayList;

public class Ejercicio15 {
    public void ejercicio15(){
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Salto");
        ciudades.add("Montevideo");
        ciudades.add("Buenos Aires");
        ciudades.add("Concordia");
        ciudades.add("Bella Unión");
        ciudades.add("Estonia");
        ciudades.add("Rocha");
        ciudades.remove(5);
        for (String palabra: ciudades){
            System.out.println("Ciudad: "+palabra);
        }
    }
}
