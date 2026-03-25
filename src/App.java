import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("== EJERCICIOS POO ==");
        System.out.println("====================");
        System.out.print("Digite el ejercicio que quiere ejecutar (ejemplo: 4 para el ejercicio 4): ");
        try{
            int entrada = sc.nextInt();
            switch (entrada) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    System.out.println("El ejercicio 7 es el mismo que el 6, verifique código. Ejecutando a continuación ...");
                    ejercicio6();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                default:
                    System.out.println("Esa opción no está disponible.");
            }
        } catch (Exception e){
            System.out.println("Digitó una entrada invalida.");
        }
    }

    public static void ejercicio1(){
        Persona p1 = new Persona("Joe Doe", 21);
        Persona p2 = new Persona("Jane Doe", 20);
        p1.presentarse();
        p2.presentarse();
    }

    public static void ejercicio2(){
        CuentaBancaria cb1 = new CuentaBancaria("Joe Doe", 100);
        CuentaBancaria cb2 = new CuentaBancaria("Jane Doe", 1500);
        cb1.depositar(200);
        cb1.retirar(150);
        cb1.retirar(100);
        cb1.mostrarSaldo();
        cb2.depositar(1000);
        cb2.retirar(4000);
        cb2.mostrarSaldo();
    }

    public static void ejercicio3(){
        Rectangulo rectangulo = new Rectangulo(15, 20);
        Rectangulo cuadrado = new Rectangulo(4);
        rectangulo.obtenerArea();
        cuadrado.obtenerArea();
    }

    public static void ejercicio4(){
        Persona p1 = new Persona("Pedro", 15);
        Persona p2 = new Persona("Pedro", 15);
        Persona p3 = new Persona("Pablo", 16);
        System.out.println("¿La persona 1 y la persona 2 son iguales? " + p1.equals(p2));
        System.out.println("¿La persona 1 y la persona 3 son iguales? " + p1.equals(p3));
    }

    public static void ejercicio5(){
        Contador c1 = new Contador();
        System.out.println("Se creó contador c1.");
        System.out.println("Contador c1 tiene: "+c1.getNumero()+" numero y "+c1.getTotalCreados()+" total.");
        Contador c2 = new Contador();
        System.out.println("Se creó contador c2.");
        System.out.println("Contador c2 tiene: "+c2.getNumero()+" numero y "+c2.getTotalCreados()+" total.");
    }

    public static void ejercicio6(){
        Auto auto = new Auto("Fiat","Strada", 220, 4);
        Moto moto = new Moto("Kawasaki", "Ninja H2R", 420, false);
        auto.describir();
        moto.describir();
    }

    public static void ejercicio8(){
        Circulo c = new Circulo(3);
        Triangulo t = new Triangulo(10, 2);

        c.describir();
        t.describir();
    }

    public static void ejercicio9(){
        Factura f = new Factura();
        f.imprimir();
    }

    public static void ejercicio10(){
        Animal[] animales = {new Perro(), new Gato(), new Vaca()};
        for (Animal a: animales){
            a.hacerSonido();
        }
    }

    public static void ejercicio11(){
        Biblioteca b = new Biblioteca();
        Libro l1 = new Libro("Las aventuras del papu", "Papulince", 1010);
        Libro l2 = new Libro("Las aventuras del papuCHO", "Papucho", 1000);
        b.agregarLibro(l1);
        b.agregarLibro(l2);
        System.out.println("Libro: "+(b.buscarPorIsbn(1000)).getTitulo());
        System.out.println("Libro: "+((b.buscarPorIsbn(1010)).getTitulo()));
        System.out.println("Libro: "+((b.buscarPorIsbn(999))));
    }

    public static void ejercicio12(){
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1200));
        productos.add(new Producto("Mouse", 25));
        productos.add(new Producto("Teclado", 75));
        productos.add(new Producto("Monitor", 300));

        Collections.sort(productos);

        // Mostrar productos ordenados
        for (Producto p : productos) {
            System.out.println(p.getNombre()+" "+p.getPrecio());
        }
    }
}
