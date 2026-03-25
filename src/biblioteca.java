
import java.util.ArrayList;

public class Biblioteca{
    private String nombre;
    private ArrayList<Libro> lista = new ArrayList<>();

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void agregarLibro(Libro nuevoLibro){
        this.lista.add(nuevoLibro);
    }

    public Libro buscarPorIsbn(int isbn){
        try{
            for (Libro libro: this.lista){
                if (libro.getIsbn()==isbn){
                    return libro;
                }
            }
            System.out.println("No se encontró el libro.");
        } catch(Exception e){
            System.out.println("Ocurrió un error.");
            return null;
        }
        return null;
    }
}