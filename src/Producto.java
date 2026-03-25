public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(int precio){
        this.precio=precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto otro){
        return Double.compare(this.precio, otro.precio);
    }
}
