import java.io.Console;

/* 
 * Calculadora de comisiones 
 * el usuario deberá ingresar el valor de sus ventas(+)
 * segun el valor de las ventas se calcula cierto porcentaje de comisión(+)
 * ventas > 10000 -> 30%(+)
 * 5001 > ventas < 9999 -> 20%(+)
 * 1001 > ventas < 4999 -> 10%(+)
 * venats < 1000 -> no hay comisión(+)
 * 
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("*****Bienvenido/a*****");
        int venta = Integer.parseInt(console.readLine("Ingrese su cifra de ventas: "));
        if (venta > 10000) {
            System.out.println("Su comisión es de: " + (venta * 0.3) + ", correspondiente al 30%");
        } else if (venta >= 5000 && venta <= 9999) {
            System.out.println("Su comisión es de: " + (venta * 0.2) + ", correspondiente al 20%");
        } else if (venta >= 1001 && venta <= 4999) {
            System.out.println("Su comisión es de: " + (venta * 0.1) + ", correspondiente al 10%");
        } else {
            System.out.println("A usted no le corresponde comisión");
        }
    }

}
