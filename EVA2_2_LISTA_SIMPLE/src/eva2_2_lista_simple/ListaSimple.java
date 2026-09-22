
package eva2_2_lista_simple;

public class ListaSimple {
    private Nodo inicio;
    public ListaSimple(){
        inicio = null;
    }
    
   //SIEMPRE EL COMPROTAMIENTO PROR DEFAULT ES AGREGAR UN NODO
    //AL FINAL DE LA LISTA
    public void agregar (int valor ){
        Nodo nuevo = new Nodo (valor);
       //QUE HACEMOS PRIMERO?
       //VERIFICAR SI TIENE O NO NODOS
       if ( inicio == null){     
       inicio = nuevo;
       }
       else {
           Nodo temp = inicio;
         while (temp.getSiguiente() != null){
            temp = temp.getSiguiente();
           }
       temp.setSiguiente(nuevo);
       nuevo.setValor(valor);
       }
   }

public void imprimir (){
    Nodo temp = inicio; 
    while (temp != null) { 
        System.out.print("[" + temp.getValor() + "] -> " );
        temp = temp.getSiguiente();
      
        }
    }
}

