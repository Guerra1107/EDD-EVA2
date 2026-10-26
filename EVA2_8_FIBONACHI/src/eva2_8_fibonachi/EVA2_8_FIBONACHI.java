
package eva2_8_fibonachi;

/**
 *
 * @author Guerra
 */
public class EVA2_8_FIBONACHI {

    public static void main(String[] args) {
               int n = 7;
        System.out.print("Serie Fibonachi hasta la posición " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonachi(i) + " ");
        }
        System.out.println(); 
    }
    public static int fibonachi(int posi) {
        if (posi == 0) {
            return 0;
        }
        if (posi == 1) {
            return 1;
        }
        return fibonachi(posi - 1) + fibonachi(posi - 2);
    }
  
}
