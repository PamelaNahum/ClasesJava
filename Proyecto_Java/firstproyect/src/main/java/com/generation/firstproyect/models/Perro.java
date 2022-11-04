package com.generation.firstproyect.models;

public class Perro {
    private String nombre;
    private String pelaje;
    private String raza;
    private Boolean vacunado;
    
    public Perro() {
    }

    public Perro(String nombre, String pelaje, String raza, Boolean vacunado) {
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public Perro(String nombre, String pelaje) {
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = "Quiltro";
        this.vacunado = false;
    }

    //con esto yo ingreso y obtengo el nombre de mi perro (método get)
    public String getNombre(){
        return nombre;
    }
    //con este MODIFICO el nombre de mi perro(método set)
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Boolean getVacunado() {
        return vacunado;
    }
    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    public void ladrar(){
        System.out.println("guau");
    }

    public void caminar(){
        System.out.println("dar un pasito");
    }

    public String truco(String tipoTruco){
        if(tipoTruco == "da la pata"){
            return "doy la pata";
        }
        return "no hago nada :c";
    }

    public Boolean adopcion(){
        //haz todo lo que yo te digo aquí dentro
        try {
            if(this.vacunado){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {// si se cae algo en el try, haz esto
            return false;
        }
        
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", pelaje=" + pelaje + ", raza=" + raza + ", vacunado=" + vacunado + "]";
    }
    
}
