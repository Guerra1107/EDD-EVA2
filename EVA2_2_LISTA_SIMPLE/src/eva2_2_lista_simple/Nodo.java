
package eva2_2_lista_simple;

public class Nodo {
    //ATRIBUTOS 
    private int valor;
    private Nodo siguiente;
    //CONSTRUCTORES
    //Es muy importante que siguiente siempre se inicialice NULL
 
    public Nodo (){
        siguiente = null;
    }
    public Nodo (int valor ){
        this.valor = valor ;
        siguiente = null;
            
        }
    //METODOS GETT Y SET
    public Nodo getSiguiente() {
        return siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
