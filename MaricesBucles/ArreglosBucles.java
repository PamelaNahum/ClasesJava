import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        //int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular: "));
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
        /* for(int i = 0; i < repeticiones ; i++){
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
            

        } */
        ArrayList <Integer> miArray = new ArrayList <Integer>();
        miArray.add(5);
        ArrayList <String> miArrayString = new ArrayList <String>(Arrays.asList("a", "b", "c"));
        System.out.println(miArray);

        

        int [] miArreglo = new int[3];
        miArreglo[0]=7;
        miArreglo[1]=8;
        miArreglo[2]=8;

        String [] miArregloListo = {"uwu","owo"};
        String [] miArregloString = new String[3];
        miArregloString[0]="hola";
        miArregloString[1]="hi";
        miArregloString[2]="ohayo";

        System.out.println(miArreglo);
        System.out.println(miArreglo.toString());

        //forEach
        for(int i: miArreglo){
            System.out.println(i);
        }
        for(String i : miArregloListo){
            System.out.println(i);
        }

        //Formas de rocorrer hashMap
        Map<String, ArrayList> miHashMap = new HashMap <String, ArrayList>();
        miHashMap.put("Tenis", miArrayString);
        miHashMap.put("Futbol", miArray);
        System.out.println(miHashMap);
        //version 1
        for (String i : miHashMap.keySet()){
            System.out.println("key: " + i + ", value: "+miHashMap.get(i));
            //miHashMap.get("Tenis"); -> nos permite ingresar al valor correspondiente a la llave ingresada ("Tenis")

        }
        //Version Fredy <3
        miHashMap.forEach((k,v)-> System.out.println("key: " + k + " Value: " + v));


        
    }
}
