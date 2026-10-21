/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queque;

/**
 *
 * @author Luis
 */
public class MyQUEUE {
    private Nodo inicio;
    private Nodo fin;
    private int tama;
    
    
    public void agregar (int valor){
        Nodo nuevo = new Nodo(valor); // Creamos el nodo con el valor
        
        if (inicio == null){
            // Si la lista está vacía, el nuevo nodo es tanto el inicio como el fin
            inicio = nuevo;
            fin = nuevo;
        } else {
            // Si ya hay elementos, conectamos el nuevo nodo al final usando 'fin'
            fin.setSiguente(nuevo);
            nuevo.setPrevio(nuevo);
            fin = nuevo; // Actualizamos 'fin' para que ahora sea este nuevo nodo
        }
        this.tama++;
    }
    public int longitud(){
        int cont = 0;
        Nodo temp = inicio;
        while(temp != null){
            cont++;
            temp = temp.getSiguente();
        }
        return cont;
    }
    
    
    public void insertarEn(int posicion, int valor){
        int tama = longitud();
        if(posicion < 0 || posicion > tama){
            throw new RuntimeException("La posición " + posicion + " no es válida para insertar");
        }
        // Inicio
        if(posicion == 0){ 
            Nodo nuevo = new Nodo(valor);
            nuevo.setSiguente(inicio);
            inicio = nuevo;
            if(fin == null){
                fin = nuevo;
            }
            return;
        }
        
        if(posicion == tama){ 
            agregar(valor);
            return;
        }
        
        //Medio
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
    // agrega un valor al final de la lista
    public void push(int valor){
        agregar(valor);
    }
    // lee el valor directamente accesible, sin borrarlo
    public int peek(){
        return valorEn(0);
    }
    // lee el valor accesible y despues lo borra
    public int pop(){
    
}
}
   // QUEUE --> FIFO (PRIMERO EN LLEGAR PRIMERO EN SALIR
   
