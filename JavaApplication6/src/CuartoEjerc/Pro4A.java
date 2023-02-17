
package CuartoEjerc;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Pro4A {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            //Accede desde la posicion final de la palabra y la iguala 
            palabraInvertida += palabra.charAt(i);
            
        }
        
        System.out.println("La palabra invertida es: " + palabraInvertida);
    }
}

