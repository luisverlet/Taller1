package javaapplication6;
import java.util.*;
/**
*
* @author luisv
*/
public class Pro1B{

public static void main(String[] args) {
int t= (int)Math.floor(Math.random()*2023+1);
int n= (int)Math.floor(Math.random()*2023+1); 

System.out.println("Numero 1: " + t);
System.out.println("Numero 2: " + n);       

int i = 1;
        do {
            System.out.println(t + " x " + i + " = " + (t * i));
            i++;
        } while (i <= n);

}
}


