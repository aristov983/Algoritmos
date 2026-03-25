public class Persona {
    private String nombre;
    private int edad;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        if (nuevoNombre!=null){
            nombre = nuevoNombre;
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int nuevaEdad){
        if (nuevaEdad >= 0){
            edad = nuevaEdad;
        }
    }

    public void presentarse(){
        if (nombre!=null){
            System.out.println("Hola, soy "+nombre+" y tengo "+edad+" años.");
        }
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Persona[nombre=" + nombre + ", edad=" + edad + "]";
    }

    @Override
    public boolean equals(Object p){
        if (this == p){
            return true;
        }
        if (p instanceof Persona){
            //Esto es un casting, le dice a java que trate a p como persona.
            Persona otra = (Persona) p;
            if (this.edad == otra.edad && this.nombre.equals(otra.nombre)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
