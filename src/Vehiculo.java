public class Vehiculo {
    private String marca;
    private String modelo;
    private int velociadMaxima;

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getVelocidadMaxima(){
        return this.velociadMaxima;
    }

    public void setMarca(String nuevaMarca){
        if (nuevaMarca!=null){
            this.marca = nuevaMarca;
        }
    }

    public void setModelo(String nuevoModelo){
        if (nuevoModelo!=null){
            this.modelo = nuevoModelo;
        }
    }

    public void setVelocidadMaxima(int nuevaVelocidad){
        if (nuevaVelocidad>0){
            this.velociadMaxima=nuevaVelocidad;
        }
    } 

    public Vehiculo(String marca, String modelo, int velocidadMaxima){
        this.modelo = modelo;
        this.marca = marca;
        this.velociadMaxima = velocidadMaxima;
    }

    public void describir(){
        System.out.println("El vehiculo de marca: "+this.getMarca()+",modelo: "+this.getModelo()+" tiene una velodiad máxima de: "+this.getVelocidadMaxima());
    }
}
