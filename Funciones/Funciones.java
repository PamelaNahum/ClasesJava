public class Funciones {

     static String Suma (int num1, int num2, String mensaje){
          int resultado = 0;
          resultado=num1+num2;
          int x = 10;

          if(x>resultado){
               return mensaje + num1 +" y "+ num2;
          }else{
               return "x no era mayor";
          }
     }

     static void SumaVoid (int num1, int num2, String mensaje){
          int resultado = 0;
          resultado=num1+num2;
          int x = 10;

          if(x>resultado){
               System.out.println(mensaje + num1 +"y"+ num2);
          }else{
               System.out.println("x no era mayor"); 
          }
     }
    public static void main(String[] args) {
     System.out.println(Suma(10, 6, "X era mayor que el resultado de: ")); 
     Suma(1, 6, "X era mayor que el resultado de: ");
     SumaVoid(10, 6, "X era mayor que el resultado de: ");
        
    }
    
}
