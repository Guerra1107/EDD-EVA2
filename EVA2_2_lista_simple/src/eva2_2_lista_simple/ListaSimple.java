package eva2_2_lista_simple;

public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaSimple(){
        inicio = null;
        fin = null;
    }

    public void agregar (int valor ){
        Nodo nuevo = new Nodo (valor);
        if ( inicio == null){     
        inicio = nuevo;
        fin = nuevo;
        }
        else {
          fin.setSiguiente(nuevo);
          fin = nuevo; 
        }
   }

    public void imprimir (){
        Nodo temp = inicio; 
        while (temp != null) { 
            System.out.print("[" + temp.getValor() + "] -> " );
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }
}