package com.generation.firstproyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproyect.models.Perro;

@SpringBootApplication
public class FirstproyectApplication {

	public static void main(String[] args) {
		Perro perroDefault = new Perro();//estoy creando un perro con el contructor por defecto
		Perro perroCompleto = new Perro("Max", "rulos", "Salchicha", true);
		Perro perroQuiltro = new Perro("Pelusa", "Liso");

		perroDefault.setNombre("copi-copi");
		perroDefault.setPelaje("pelo duro");
		perroDefault.setRaza("gucci");
		perroDefault.setVacunado(true);

		perroQuiltro.setVacunado(true);

		String nombrePerro = perroDefault.getNombre();
		String nombrePerro2 = perroCompleto.getNombre();

		System.out.println(nombrePerro);
		System.out.println(nombrePerro2);
		System.out.println(perroQuiltro.toString());
		perroQuiltro.setVacunado(false);

		/* perroDefault.ladrar();
		perroCompleto.caminar(); */

		/* System.out.println(perroQuiltro.truco("hacete el muerto"));
		System.out.println(perroCompleto.adopcion());
		System.out.println(perroQuiltro.adopcion()); */
		
	}

}
