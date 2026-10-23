
package eva2_4_queque;

public class MyQUEUE {
    private Nodo inicio;
    private Nodo fin;
    private int tama;
    
    
    public void agregar (int valor){
        Nodo nuevo = new Nodo(valor);
        if (inicio == null){
     inicio = nuevo;
            fin = nuevo;
        } else {
                 fin.setSiguente(nuevo);
            nuevo.setPrevio(nuevo);
            fin = nuevo; 
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

    public void push(int valor){
        agregar(valor);
    }
        public int peek(){
        return valorEn(0);
    }

    public int pop(){
    
}
}
     
