public class Moto extends Vehiculo {
    boolean tieneSidecar;

    public boolean getTieneSidecar(){
        return tieneSidecar;
    }

    public Moto(String marca, String modelo, int velociadMaxima, boolean tieneSidecar){
        super(marca, modelo, velociadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void describir(){
        //también podemos usar super.describir() y agregar lo adicional abajo
        System.out.println("El vehiculo de marca: "+this.getMarca()+",modelo: "+this.getModelo()+" tiene una velodiad máxima de: "+this.getVelocidadMaxima()+" ¿Tiene sidecar? "+ getTieneSidecar());
    }
    
}
