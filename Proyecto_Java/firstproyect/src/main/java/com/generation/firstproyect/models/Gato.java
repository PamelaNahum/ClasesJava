package com.generation.firstproyect.models;

public class Gato extends Animales {
    Integer bigotes;

    public Gato() {
        super();
    }

    public Gato(Integer bigotes, String nombre, String raza, String pelaje, Boolean vacunado) {
        super(nombre, raza, pelaje, vacunado);
        this.bigotes = bigotes;
    }
    
    public Integer getBigotes() {
        return bigotes;
    }

    public void setBigotes(Integer bigotes) {
        this.bigotes = bigotes;
    } 
    

    @Override
    public String toString() {
        return super.toString()+", "+ "Gato [bigotes=" + bigotes + "]";
    }

    

    
    
}
