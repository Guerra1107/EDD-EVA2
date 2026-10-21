/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Luis
 */
public class EVA2_2_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimple lista = new ListaSimple();
        /*int[] arreglo = new int[1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime();// toamos laa Hora antes e empezar 
        
        for (int i = 0; i < arreglo.length;i++){
            arreglo[i] = (int)(Math.random() * 100);
        }
        fin = System.nanoTime();// tomamos la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);
        
        ini = System.nanoTime();// toamos laa Hora antes e empezar 
        for (int i = 0; i < 1000000;i++){
            lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime();// tomamos la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);*/
        System.out.println("Tamano de la lista: " + lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        // imprimir
        lista.imprimir();
        System.out.println("Tamano de la lista= " + lista.longitud());
        lista.vaciarLista();
        lista.imprimir();
        System.out.println("Tamano de la lista = " + lista.longitud());
        //System.out.println("Valor en la posicion  " + lista.longitud());
        
        lista.imprimirAlReves();
    }
    
}
