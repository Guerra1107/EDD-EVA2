
package eva2_2_lista_simple;

public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaSimple(){
        fin = null; 
        inicio = null;
}   
    public void agregar (int valor){
        Nodo nuevo = new Nodo(valor); 
        
        if (inicio == null){
           
            inicio = nuevo;
            fin = nuevo;
        } else {
            
            fin.setSiguente(nuevo);
            fin = nuevo; 
        }
    }
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getDato() + "]");
            temp = temp.getSiguente();
            
        }
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
  
    public boolean listaVacia(){
        if (inicio == null){
            return true;
        }else{
            return false;
        }
    }
    public void vaciarLista(){
        inicio = null;
        fin = null;
    }

    public int valorEn(int posicion){

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
        
        if(posicion == 0){ 
            inicio = inicio.getSiguente();
            if(inicio == null){
                fin = null; 
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
            fin = temp; 
        }
    }
    private void imprimirAlReves(Nodo temp) {
        if (temp == null) {
            return; 
        }
        imprimirAlReves(temp.getSiguente());
        
        System.out.println("[" + temp.getDato() + "]");
    }
    
 
}
