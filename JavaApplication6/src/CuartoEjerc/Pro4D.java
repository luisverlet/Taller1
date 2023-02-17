
package CuartoEjerc;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Pro4D {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese una palabra: ");
    String palabra = sc.nextLine();

    String palabraInvertida = "";
    for (char letra : palabra.toCharArray()) {
        palabraInvertida = letra + palabraInvertida; // Añade la letra al principio de la cadena
    }

    System.out.println("La palabra invertida es: " + palabraInvertida);
}
}
