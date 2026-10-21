package com.mycompany.eva2_4_queue;

public class MiColaDoble {
    
    // Clase Nodo interna
    class NodoDoble {
        int dato;
        NodoDoble siguiente;
        NodoDoble anterior;

        public NodoDoble(int dato) {
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    private NodoDoble inicio;
    private NodoDoble fin;    
    private int tamanio;

    public MiColaDoble() {
        this.inicio = null;
        this.fin = null;
        this.tamanio = 0;
    }

    public void push(int valor) {
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = fin;
            fin = nuevoNodo;
        }
        tamanio++;
    }

    public int peek() {
        if (inicio == null) {
            System.out.println("La cola está vacía.");
            return -1; 
        }
        return inicio.dato;
    }

    public int pop() {
        if (inicio == null) {
            System.out.println("La cola está vacía, no hay elementos para eliminar.");
            return -1;
        }

        int valorAuxiliar = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }

        tamanio--;
        return valorAuxiliar;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void mostrar() {
        NodoDoble actual = inicio;
        System.out.print("Cola (Inicio -> Fin): ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
