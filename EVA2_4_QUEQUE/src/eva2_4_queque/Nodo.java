/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queque;

/**
 *
 * @author Luis
 */
public class Nodo {
    // Dos atributos
    private int valor;
    private Nodo siguente;
    private Nodo previo;
    // constructores

    public Nodo() {
        siguente = null;//ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
        previo = null;
    }
    
    public Nodo(int dato) {// PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NIDO
        this.valor = dato;
        siguente = null;
    }

    public Nodo getPrevio() {
        return previo;
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

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
    
}

