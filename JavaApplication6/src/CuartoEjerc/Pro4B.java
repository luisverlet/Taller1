
package CuartoEjerc;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Pro4B {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Ingrese una palabra: ");
    String palabra = sc.nextLine();
    
    String palabraInvertida = "";
    int i = palabra.length() - 1;
    do {
        palabraInvertida += palabra.charAt(i); //accede desde la posicion i 
        i--;
    } while (i >= 0);
    
    System.out.println("La palabra invertida es: " + palabraInvertida);
    }
}

