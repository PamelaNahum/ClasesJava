public class ApuntesFunciones {

    /*funciones en JavaScript
     * function nombreFuncion (){}
     * 
     * static (el tipo valor que va a devolver) NombreFuncion (){}
     * 
     * 2 tipos de funciones en Java
     * las funciones que retornan -> static int NombreFuncion(){}
     * y 
     * las funciones que NO retornan -> static void NombreFuncion(){}
     */
    //Ejemplos
    //Funcion que retorna un valor 
    /*
     * static int Suma (){
     * int resultado = 0;
     * int x = 10;
     * 
     * resultado = 4+5;
     * 
     * if(x>resultado){
     *  return 1;
     * }else{
     *  return 0;
     * }
     * }
     * int resultadoGuardado = Suma();
     * resultadoGuardado = resultadoGuardado +1;
     */
    //Funcion que NO retorna
    /*
     * static void HolaMundo(){
     * int resultado = 0;
     * 
     * resultado = 4+5;
     * 
     *  System.out.print(resultado);
     * }
     * resultado= resultado +1; (esto no se puede :c)
     */
    //Ejemplo función que retorna con parámetros
    /* static String Suma (int num1, int num2, String palabra){
         int resultado = 0;
         int x = 10;
         
         resultado = num1+num2;
         
         if(x>resultado){
          return "x es mayor que la suma de num1 + num2"+palabra;
         }else{
          return "x es menor que la suma de num1 + num2";
         }
         } 
         System.out.print(Suma());
         */
    //Ejemplo función que NO retorna con parámetros
    /* static void Suma (int num1, int num2){
         int resultado = 0;
         int x = 10;
         
         resultado = num1+num2;
         
         if(x>resultado){
          System.out.print("x es mayor que la suma de num1 + num2");
         }else{
          System.out.print("x es menor que la suma de num1 + num2");
         }
         } */
    
}
