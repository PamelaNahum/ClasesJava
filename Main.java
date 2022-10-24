import java.io.Console;

public class Main {
    public static void main (String [] args){
        //para mostrar en consola en JavaScript -> console.log()
        //para mostrar en consola en Java
        System.out.print("este es un mensaje en consola ");
        //este imprime con salto de linea
        System.out.println("Hola");
        //para pedile información al usuario de ocupa
        Console console = System.console();
        String nombre = console.readLine("inserte nombre: ");
        System.out.println("este es el nombre: "+nombre);
        //vamos a pedir a usuario 2 números
        String num = console.readLine("inserte número 1: ");
        int nuevoNum = Integer.parseInt(num);
        String num2 = console.readLine("inserte número 2: ");
        int nuevoNum2 = Integer.parseInt(num2);
        int suma = nuevoNum + nuevoNum2;
        //int suma = Integer.parseInt(num) + Integer.parseInt(num2); -> tambien es correcto
        System.out.println("el número es: " + suma);
        
        
    }
}
