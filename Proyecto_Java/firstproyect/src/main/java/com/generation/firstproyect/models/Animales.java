package com.generation.firstproyect.models;

public class Animales {
    String nombre;
    String raza;
    String pelaje;
    Boolean vacunado;

    public Animales() {
    }

    public Animales(String nombre, String raza, String pelaje, Boolean vacunado) {
        this.nombre = nombre;
        this.raza = raza;
        this.pelaje = pelaje;
        this.vacunado = vacunado;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    public void emitirSonido(){
        System.out.println("Sonido");
    }

    public void desplazarse(){
        System.out.println("moverse de un lugar a otro");
    }

    public void comer(){
        System.out.println("comer");
    }



    @Override
    public String toString() {
        return "Animales [nombre=" + nombre + ", raza=" + raza + ", pelaje=" + pelaje + ", vacunado=" + vacunado + "]";
    }

    
    
    
}
