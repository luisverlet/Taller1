
package javaapplication6;
import java.util.*;
/**
*
* @author luisv
*/
public class Pro1D{

public static void main(String[] args) {
int t= (int)Math.floor(Math.random()*2023+1);
int n= (int)Math.floor(Math.random()*2023+1); 

System.out.println("Numero 1: " + t);
System.out.println("Numero 2: " + n);       

 int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }

        for (int nume : numeros) {
            System.out.println(t + " x " + nume + " = " + (t * nume));

}
}
}