package com.generation.firstproyect.models;

public class MiniConejo extends Conejo {

    String tipoConejo;


    public MiniConejo() {
        super();
    }


    public MiniConejo(String nombre, String raza, String pelaje, Boolean vacunado, Float longitudDientes,
            String tipoConejo) {
        super(nombre, raza, pelaje, vacunado, longitudDientes);
        this.tipoConejo = tipoConejo;
    }


    public String getTipoConejo() {
        return tipoConejo;
    }

    public void setTipoConejo(String tipoConejo) {
        this.tipoConejo = tipoConejo;
    }


    @Override
    public String toString() {
        return super.toString()+", "+ "MiniConejo [tipoConejo=" + tipoConejo + "]";
    }

    

    
    
}
