
package CuartoEjerc;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Pro4C {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese una palabra: ");
    String palabra = sc.nextLine();

    String palabraInvertida = "";
    int i = palabra.length() - 1;
    while (i >= 0) {
        palabraInvertida += palabra.charAt(i); // Accede desde la posicion i
        i--;
    }

    System.out.println("La palabra invertida es: " + palabraInvertida);
    }
}
