package com.generation.firstproyect.models;

public class Conejo extends Animales {

    Float longitudDientes;

    public Conejo() {
        super();
    }
    
    public Conejo(String nombre, String raza, String pelaje, Boolean vacunado, Float longitudDientes) {
        super(nombre, raza, pelaje, vacunado);
        this.longitudDientes = longitudDientes;
    }

    public Float getLongitudDientes() {
        return longitudDientes;
    }

    public void setLongitudDientes(Float longitudDientes) {
        this.longitudDientes = longitudDientes;
    }

    public void saltarAlto (){
        System.out.println("Salto muy alto :D");
    }

    

    @Override
    public String toString() {
        return super.toString()+", "+ "Conejo [longitudDientes=" + longitudDientes + "]";
    }

    

    
    
}
