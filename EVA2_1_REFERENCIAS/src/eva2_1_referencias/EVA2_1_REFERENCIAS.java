
package eva2_1_referencias;

public class EVA2_1_REFERENCIAS {
    
    public static void main(String[] args) { 
         Ejemplo ejemplo1 = new Ejemplo();
     System.out.println("ejemplo1 = " + ejemplo1);
          System.out.println("ejemplo1.val = " + ejemplo1.val);
                System.out.println("ejemplo1.otro = " + ejemplo1.otro);
                
        ejemplo1.otro = new Ejemplo();
    System.out.println("ejemplo1 = " + ejemplo1.otro);
        System.out.println("ejemplo1.val = " + ejemplo1.otro.val);
            System.out.println("ejemplo1.otro = " + ejemplo1.otro.otro);
            
            ejemplo1.otro.otro = new Ejemplo();
            ejemplo1.otro.otro.otro = new Ejemplo();
            ejemplo1.otro.otro.otro.otro = new Ejemplo ();
            
            Ejemplo siguiente = ejemplo1;
            while(siguiente != null){
        System.out.println ("[" + siguiente.val + "]");
        siguiente = siguiente.otro;
            System.out.println ("");
        }
    } 
}

 class Ejemplo{
    int val = 5;
    Ejemplo otro;
 }
