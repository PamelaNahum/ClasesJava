import java.io.Console;

public class OperLogicos {
    public static void main(String[] args) {
        // operadores lógicos en javaScript
        /*
         * y -> &&
         * o -> ||
         * negación lógica -> !
         */
        //Operadores de comparación 
        /*
         * comparaciones de numeros
         * 4>7 -> falso
         * 5<10 -> verdadero
         * 9==4 -> falso
         */
        Console console = System.console();

        int numero = Integer.parseInt(console.readLine("Ingresa el número 1: "));
        String numero2 = console.readLine("Ingresa el número 2: ");
        int numeroInt2 = Integer.parseInt(numero2);

        if(numero>numeroInt2){
            System.out.println("el primer número es mayor");
        }
        else{
            System.out.println("el segundo número es mayor");
        }
    }
}
