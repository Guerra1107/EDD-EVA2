
package eva2_10_collections;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;

/**
 *
 * @author Guerra
 */
public class EVA2_10_COLLECTIONS {

    public static void main(String[] args) {
  
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(10);    
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        System.out.println(lista);
        System.out.println(lista.size());
        lista.clear();
        System.out.println(lista.size());

  
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hola");
        arrayList.add("");
        arrayList.add("mundo");
        arrayList.add("!!");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

   
        Stack<Integer> stack = new Stack<>();
        stack.add(100);    
        stack.add(200);
        stack.add(300);
        stack.add(400);
        stack.add(500);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    
        Queue<String> queue = new LinkedList<>();
        queue.add("100");    
        queue.add("200");
        queue.add("300");
        queue.add("400");
        queue.add("500");
        queue.add("hola");
        queue.add("");
        queue.add("mundo");
        queue.add("!!");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}