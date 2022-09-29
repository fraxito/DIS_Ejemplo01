package com.ufv.ejemplo01;

public class Persona {

    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDnisinletra() {
        return dnisinletra;
    }

    public void setDnisinletra(int dnisinletra) {
        this.dnisinletra = dnisinletra;
    }

    public void setEdad(int _edad){
        if (_edad <= 18) {
            System.out.println("Estas hecho un chaval!");
        }
        else {
            System.out.println("ok Boomer");
        }
        this.edad= _edad;
    }
    public int getEdad(){
        return this.edad;
    }
}
