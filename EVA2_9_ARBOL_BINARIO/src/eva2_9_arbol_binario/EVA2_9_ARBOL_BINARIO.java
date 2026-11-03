package eva2_9_arbol_binario;

public class EVA2_9_ARBOL_BINARIO {

    public static void main(String[] args) {
        arbol_binario arbol = new arbol_binario();

        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        
        System.out.print("Recorrido PreOrder: ");
        arbol.preOrder();
    }
}