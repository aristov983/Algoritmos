public class Rectangulo {
    private double ancho;
    private double alto;

    public double getAncho(){
        return this.ancho;
    }

    public double getAlto(){
        return this.alto;
    }

    public void setAlto(double nuevoAlto){
        if (nuevoAlto>0){
            this.alto = nuevoAlto;
        }
    }

    public void setAncho(double nuevoAncho){
        if (nuevoAncho>0){
            this.ancho = nuevoAncho;
        }
    }

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public Rectangulo(double medidas){
        this.alto = this.ancho = medidas;
    }

    public void obtenerArea(){
        System.out.println("El área de la figura es: "+(alto*ancho));
    }
}
