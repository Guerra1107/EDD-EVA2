
package eva2_11_iterator;

import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Guerra
 */
public class EVA2_11_ITERATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(100);    
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        
        System.out.println(lista);
        
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}