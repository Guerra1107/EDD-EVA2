package eva2_9_arbol_binario;

/**
 * @author Guerra
 */
public class arbol_binario {
    private Nodo root;
    
    public arbol_binario (){
        root = null;
    }
    
    public void agregar (int valor){
        if (root == null) {
            root = new Nodo (valor);
        } else {
            agregarRecu(root, valor);
        }
    }
    
    private void agregarRecu (Nodo actual, int valor){
        if (valor < actual.getDato()) {
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(new Nodo(valor)); 
            } else {
                agregarRecu(actual.getIzquierda(), valor); 
            }
        } else { 
            if (actual.getDerecha() == null) {
                actual.setDerecha(new Nodo(valor)); 
            } else {
                agregarRecu(actual.getDerecha(), valor); 
            }
        }
    }
    
    public void preOrder(){
        preOrderRecu(root);
        System.out.println();
    }
    
    private void preOrderRecu(Nodo actual){
        if (actual == null) {
            return;
        }
        System.out.print(actual.getDato() + "-");
        if(actual.getIzquierda() != null){
            preOrderRecu(actual.getIzquierda());
        }
        if(actual.getDerecha() != null){
            preOrderRecu(actual.getDerecha()); 
        }
    }
}