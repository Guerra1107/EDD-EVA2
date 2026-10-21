package eva2_3_lista_doble;

public class NODO {
    private int valor;
    private NODO siguente;
    private NODO previo;
   
    public NODO() {
        siguente = null;
        previo = null;
    }
    
    public NODO(int dato) {
        this.valor = dato;
        siguente = null;
        previo = null;
    }

    public NODO getPrevio() {
        return previo;
    }
   
    public int getDato() {
        return valor;
    }

    public NODO getSiguente() {
        return siguente;
    }

    public void setDato(int dato) {
        this.valor = dato;
    }

    public void setSiguente(NODO siguente) {
        this.siguente = siguente;
    }

    public void setPrevio(NODO previo) {
        this.previo = previo;
    }
}