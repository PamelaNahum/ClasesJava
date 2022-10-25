import java.io.Console;

public class ArreglosBucles {
    /* bucles JavaScript
     * for, for each, while y do while
     *for en JavaScript -> for (var i = 0; i < 2 ; i++){} 
     *for en Java -> for(int i = 0; i < 2; i++){}
     * for each en javaScript -> nomArreglo.forEach(element)(siendo element cada objeto de arreglo)
     * for each en Java -> for(String nomArreglo: element){}
     * while en JavaScript -> while(condicion){}(verificar que en algun momento se cumpla la condición)
     * while en Java -> while(condición){}(igual que JavaScript)
     * do while JavaScript -> do{se hace la operación}while(condición);
     * do while Java -> do{se hace la operación}while(condición);
     * el do while se ocupa en casos donde si o si al menos una vez, se debe realizar la operación
    */
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("*****Bienvenido/a*****");
        int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular: "));
        //********Opcion con contador******** */
        /* int contador = 0;
        while(contador!=repeticiones){
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
            System.out.println(contador);
            contador++;
            System.out.println(contador);
        } */

        //********Opcion sin contador******** */
        
        /* while(repeticiones!=0){
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
            repeticiones--;
            System.out.println(repeticiones);
        } */
        //********Opcion con for******** */
        for(int i = 0; i < repeticiones ; i++){
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
}
