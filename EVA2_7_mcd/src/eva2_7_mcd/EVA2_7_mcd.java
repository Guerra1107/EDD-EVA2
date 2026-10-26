package eva2_7_mcd;

/**
 * @author Guerra
 */
public class EVA2_7_mcd {

    public static void main(String[] args) {
        int resultado = mcd(48, 18);
        System.out.println("El MCD es: " + resultado);
    }

    public static int mcd(int dividendo, int divisor) {
        int residuo = dividendo % divisor;
        if (residuo == 0) {
            return divisor;
        }
        return mcd(divisor, residuo);
    }
}