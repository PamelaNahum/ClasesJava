package com.generation.firstproyect;

import java.io.Console;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproyect.models.Conejo;
import com.generation.firstproyect.models.Gato;
import com.generation.firstproyect.models.MiniConejo;
import com.generation.firstproyect.models.Perro;

import ch.qos.logback.core.joran.conditional.ElseAction;

@SpringBootApplication
public class FirstproyectApplication {

	public static void main(String[] args) {
		/* Perro perroDefault = new Perro();//estoy creando un perro con el contructor por defecto
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
		perroQuiltro.setVacunado(false); */

		/* ArrayList <Perro> perros = new ArrayList<Perro>();
		Console console = System.console();
		int cantidad = Integer.parseInt(console.readLine("Ingrese cuantos perros quiere crear: "));
		for (int i = 0; i < cantidad; i++){
			Perro perro = new Perro();
			perro.setNombre(console.readLine("Ingresa el nombre del perro: "));
			perro.setPelaje(console.readLine("Ingrese el pelaje del perro: "));
			perro.setRaza(console.readLine("Ingrese la raza del perro: "));
			int vacunado = Integer.parseInt(console.readLine("ingrese 1 si el perro está vacunado, en caso contrario ingrese 2, si no sabe ingrese 3: "));
			while(vacunado>3 || vacunado<1){
				vacunado = Integer.parseInt(console.readLine("ingrese 1 si el perro está vacunado, en caso contrario ingrese 2, si no sabe ingrese 3: "));
			}
			if (vacunado == 1 ){
				perro.setVacunado(true);
			}else if(vacunado==2){
				perro.setVacunado(false);
			}else if(vacunado == 3){
				perro.setVacunado(null);
			}
			perros.add(perro);
		}
		System.out.println(perros); */

		/* Gato gato = new Gato();
		System.out.println(gato);
		Gato gatoCompleto = new Gato(3,"Juan","Siames","Peludito", true);
		System.out.println(gatoCompleto);

		Conejo conejo = new Conejo();
		conejo.saltarAlto();

		conejo.comer();
		gato.comer();

		MiniConejo miniConejo = new MiniConejo("mini", "orejas caidas", "suave", true, 3.2f, "chiquito");
		System.out.println(miniConejo); */

		Perro perro = new Perro();
		System.out.println(perro.adopcion());

	}

}
