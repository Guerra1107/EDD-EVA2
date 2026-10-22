
package eva2_2_lista_simple;


public class Nodo {
   
    private int valor;
    private Nodo siguente;
 
    public Nodo() {
        siguente = null;
    }
    
    public Nodo(int dato) {
        this.valor = dato;
        siguente = null;
    }

    public int getDato() {
        return valor;
    }

    public Nodo getSiguente() {
        return siguente;
    }

    public void setDato(int dato) {
        this.valor = dato;
    }

    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }
    
    
    
}
