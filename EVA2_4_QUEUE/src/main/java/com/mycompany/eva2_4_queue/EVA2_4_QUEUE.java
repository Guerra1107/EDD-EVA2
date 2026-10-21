
package com.mycompany.eva2_4_queue;

/**
 *
 * @author Guerra
 */

public class EVA2_4_QUEUE {

     public static void main(String[] args) {
        MiColaDoble cola = new MiColaDoble();

        cola.push(10);
        cola.push(20);
        cola.push(30);

        cola.mostrar(); // Salida: 10 20 30

        System.out.println("Peek (Primer elemento): " + cola.peek()); // 10

        System.out.println("Pop (Eliminado): " + cola.pop()); // 10
        cola.mostrar(); // Salida: 20 30
    }
}