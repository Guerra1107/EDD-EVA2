package eva2_9_arbol_binario;

/**
 * @author Guerra
 */
public class Nodo {
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;
   
    public Nodo() {
        this.izquierda = null;
        this.derecha = null;
    }
    
    public Nodo(int valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    public int getDato() {
        return valor;
    }

    public void setDato(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}