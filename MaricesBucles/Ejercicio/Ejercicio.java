import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio {
    public static void main(String[] args) {
        Map <String, ArrayList> libroClases = new HashMap<String, ArrayList>();
        Console console = System.console();
        System.out.println("******Bienvenido/a******");
        int cantidad = Integer.parseInt(console.readLine("Ingrese cantidad de alumnos a ingresar: "));
        while(cantidad!=0){
            String nombre = console.readLine("Ingrese nombre del alumno/a: ");
            ArrayList <Float> notas = new ArrayList<Float>();
            for (int i = 1; i <= 3; i++){
                Float nota = Float.parseFloat(console.readLine("Ingrese nota "+i+": "));
                notas.add(nota);
            }
            libroClases.put(nombre, notas);
            cantidad--;
        }
        System.out.println(libroClases);
        for(String i: libroClases.keySet()){
            float suma = 0.0f;
            for(Object x : libroClases.get(i)){
                suma = (Float) x + suma;
            }
            System.out.println("El promedio de: "+i+" fue de: "+suma/3);
        }

       
    }

    
}
