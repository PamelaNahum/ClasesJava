package com.generation.firstproyect.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.firstproyect.models.Perro;
//al se una clase de tipo test solo yo debo tener acceso a esta
class PerroTest {
    //le aviso a java que es un test
    @Test
    //declaro una funcion para mi test
    void testAdopcion(){
        //creo mi objeto para testear
        Perro perro = new Perro();
        //comparo mi resultado esperado con la funcion que debe responder
        assertEquals(false, perro.adopcion());
    }
    @Test
    void testTruco(){
        Perro perro = new Perro();
        assertEquals("doy la pata", perro.truco("da la pata"));
    }
    @Test
    void testTrucoFail(){
        Perro perro = new Perro();
        assertEquals("doy la pata", perro.truco("Hazte el muerto"));
    }
    
}
