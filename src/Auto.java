public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public int getCantidadPuertas(){
        return this.cantidadPuertas;
    }

    public void setCantidadPuertas(int nuevaCantidadPuertas){
        if (nuevaCantidadPuertas>=0){
            this.cantidadPuertas=nuevaCantidadPuertas;
        }
    }

    public Auto(String marca, String modelo, int velociadMaxima, int cantidadPuertas){
        super(marca, modelo, velociadMaxima);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void describir(){
        //también podemos usar super.describir() y agregar lo adicional abajo.
        System.out.println("El vehiculo de marca: "+this.getMarca()+",modelo: "+this.getModelo()+" tiene una velodiad máxima de: "+this.getVelocidadMaxima()+" además tiene "+this.getCantidadPuertas()+" puertas.");
    }
}
