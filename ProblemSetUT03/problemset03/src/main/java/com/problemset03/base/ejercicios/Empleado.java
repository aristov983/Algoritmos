package com.problemset03.base.ejercicios;

public class Empleado {
    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo){
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public String toString(){
        return "El empleado " + this.nombre + " con cargo " + this.cargo;
    }
}
