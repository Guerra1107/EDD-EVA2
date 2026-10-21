
package eva2_5_recursividad;


public class EVA2_5_RECURSIVIDAD {

   public static void main(String[] args) {
      
   }
   public static void imprimirInvCiclo(int valor){
      for (int i = valor; i >= 1; i--){
         System.out.println(i + " - ");
      }
      System.out.println("");
   
   }
   public static void imprimirInvRec(int valor){
      if(valor >= 1){
      System.out.println(valor + " - ");
      imprimirInvRec(valor - 1 );
      }   
   
   }
   

}