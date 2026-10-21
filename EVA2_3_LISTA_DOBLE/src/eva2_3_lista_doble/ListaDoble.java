package eva2_3_lista_doble;

public class ListaDoble {
    private NODO inicio;
    private NODO fin;
    private int tama;
    
    public void agregar(int valor){
        NODO nuevo = new NODO(valor); 
        
        if (inicio == null){
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo; 
        }
        this.tama++;
    }

    public int longitud(){
        int cont = 0;
        NODO temp = inicio;
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
            NODO nuevo = new NODO(valor);
            if(inicio != null){
                nuevo.setSiguente(inicio);
                inicio.setPrevio(nuevo);
                inicio = nuevo;
            } else {
                inicio = nuevo;
                fin = nuevo;
            }
            this.tama++;
            return;
        }
        
        if(posicion == tama){ 
            agregar(valor);
            return;
        }
        
        NODO nuevo = new NODO(valor);
        NODO temp = inicio;
        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguente();
        }
        
        NODO siguienteNodo = temp.getSiguente();
        nuevo.setSiguente(siguienteNodo);
        nuevo.setPrevio(temp);
        temp.setSiguente(nuevo);
        if(siguienteNodo != null){
            siguienteNodo.setPrevio(nuevo);
        }
        this.tama++;
    }

    public void borrarEn(int posicion){
        int tama = longitud();
        if(posicion < 0 || posicion >= tama){
            throw new RuntimeException("La posición " + posicion + " no es válida para borrar");
        }
        
        if(posicion == 0){ 
            inicio = inicio.getSiguente();
            if(inicio != null){
                inicio.setPrevio(null);
            } else {
                fin = null; 
            }
            this.tama--;
            return;
        }
        
        NODO temp = inicio;
        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguente();
        }
        
        NODO nodoAEliminar = temp.getSiguente();
        NODO siguienteNodo = nodoAEliminar.getSiguente();
        
        temp.setSiguente(siguienteNodo);
        if(siguienteNodo != null){
            siguienteNodo.setPrevio(temp);
        }
        
        if(nodoAEliminar == fin){
            fin = temp;
        }
        this.tama--;
    }

    public void imprimir(){
        NODO temp = inicio;
        System.out.print("Lista Doble: ");
        while(temp != null){
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguente();
        }
        System.out.println();
    }
}
   