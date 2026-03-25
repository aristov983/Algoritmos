public class Circulo extends Figura {
    public double pi;
    public double radio;

    @Override
    public double area(){
        return Math.pow((pi*radio),2);
    }

    public Circulo(double radio){
        this.pi = 3.14;
        this.radio = radio;
    }
}
