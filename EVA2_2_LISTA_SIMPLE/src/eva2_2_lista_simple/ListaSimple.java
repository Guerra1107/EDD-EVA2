/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Luis
 */
public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaSimple(){
        fin = null; // al estar la lista, se crea vacia
        inicio = null;
}   //O(N) --> se agrega al final, 
    // siempre se agrega al final de la lista
    
    public void agregar (int valor){
        Nodo nuevo = new Nodo(valor); // Creamos el nodo con el valor
        
        if (inicio == null){
            // Si la lista está vacía, el nuevo nodo es tanto el inicio como el fin
            inicio = nuevo;
            fin = nuevo;
        } else {
            // Si ya hay elementos, conectamos el nuevo nodo al final usando 'fin'
            fin.setSiguente(nuevo);
            fin = nuevo; // Actualizamos 'fin' para que ahora sea este nuevo nodo
        }
    }
    // O(N) 
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getDato() + "]");
            temp = temp.getSiguente();
            
        }
    }
    // O(N)
    public int longitud(){
        int cont = 0;
        Nodo temp = inicio;
        while(temp != null){
            cont++;
            temp = temp.getSiguente();
        }
        return cont;
    }
    // O(1)
    public boolean listaVacia(){
        if (inicio == null){// Lista vacia
            return true;
        }else{
            return false;
        }
    }
    public void vaciarLista(){
        inicio = null;
        fin = null;
    }
    // validar posicion tenga valor valido\
    // throws
    public int valorEn(int posicion){
        // exepcion
       // O(N)
       int tama = longitud();
       if(posicion >= 0 && posicion < tama){
           
           Nodo temp = inicio;
           for( int i = 0; i < posicion;i++){
               temp = temp.getSiguente();
           }
           return temp.getDato();
       }else{
           throw new RuntimeException ("La pocision " + posicion + "no es valida");
       }
        
    }
    // regresa la primer aparicion del valor en la lista 
    // Regresa la posicion 
    // O (??)
    
    public int encontrarEn(int valor){
        Nodo temp = inicio;
        int posicion = 0;
        while(temp != null){
            if(temp.getDato() == valor){
                return posicion;
            }
            temp = temp.getSiguente();
            posicion++;
        }
        return -1;
    }
    
    
    public void insertarEn(int posicion, int valor){
        int tama = longitud();
        if(posicion < 0 || posicion > tama){
            throw new RuntimeException("La posición " + posicion + " no es válida para insertar");
        }
        
        if(posicion == 0){ // Insertar al inicio
            Nodo nuevo = new Nodo(valor);
            nuevo.setSiguente(inicio);
            inicio = nuevo;
            if(fin == null){
                fin = nuevo;
            }
            return;
        }
        
        if(posicion == tama){ // Insertar al final
            agregar(valor);
            return;
        }
        
        // Insertar en medio
        Nodo nuevo = new Nodo(valor);
        Nodo temp = inicio;
        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguente();
        }
        nuevo.setSiguente(temp.getSiguente());
        temp.setSiguente(nuevo);
    }
    public void borrarEn(int posicion){
        int tama = longitud();
        if(posicion < 0 || posicion >= tama){
            throw new RuntimeException("La posición " + posicion + " no es válida para borrar");
        }
        
        if(posicion == 0){ // Borrar el primer nodo
            inicio = inicio.getSiguente();
            if(inicio == null){
                fin = null; // Si la lista se quedó vacía
            }
            return;
        }
        
        Nodo temp = inicio;
        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguente();
        }
        
        Nodo nodoAEliminar = temp.getSiguente();
        temp.setSiguente(nodoAEliminar.getSiguente());
        
        if(nodoAEliminar == fin){
            fin = temp; // Actualizamos el fin si eliminamos el último elemento
        }
    }
    private void imprimirAlReves(Nodo temp) {
        if (temp == null) {
            return; 
        }
        imprimirAlReves(temp.getSiguente());
        
        System.out.println("[" + temp.getDato() + "]");
    }
    
    //insertar 
    //inversa 
    //
}
