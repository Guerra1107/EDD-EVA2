package eva2_2_lista_simple;

public class Nodo {
    private int valor;
    private Nodo siguiente;
   
    public Nodo (){
        siguiente = null;
    }
    public Nodo (int valor ){
        this.valor = valor ;
        siguiente = null;
    }

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