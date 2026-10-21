/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Luis
 */
public class Nodo {
    // Dos atributos
    private int valor;
    private Nodo siguente;
    // constructores

    public Nodo() {
        siguente = null;//ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
    }
    
    public Nodo(int dato) {// PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NIDO
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
