package SegundoEjerc;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Pro2A {
    
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      
// Generamos un numero aleatorio
    int NumeroAl = (int) Math.floor(Math.random() * 53+1);
    System.out.println("El número aleatorio es: " + NumeroAl);
//que pida el numero x cantidad de veces
        int[] guardados = new int[NumeroAl];

        for (int i = 0; i < NumeroAl; i++) {
            System.out.print("Introduce un número: ");
// Guardamos el número ingresado
            guardados[i] = sc.nextInt(); 
        }

// Calculamos la media
    int suma = 0;
    for (int numero : guardados) {
      suma += numero;
    }
    double media = (double) suma / guardados.length;
     System.out.println("La media es: " + media);
     
//Calculamos la mediana
    //Ordenamos el arreglo uwu
        Arrays.sort(guardados);
      double mediana;
      if (guardados.length % 2 == 0) {
          // Si el número de elementos es par, la mediana es la media de los dos elementos centrales
          int indiceCentral1 = guardados.length / 2;
          int indiceCentral2 = indiceCentral1 - 1;
          mediana = (guardados[indiceCentral1] + guardados[indiceCentral2]) / 2;
      } else {
          // Si el número de elementos es impar, la mediana es el elemento central
          int indiceCentral = guardados.length / 2;
          mediana = guardados[indiceCentral];
      }
        System.out.println("La mediana es: " + mediana);
        
        // Calculamos la moda 
        int moda = 0;
        int frecuenciaModa = 0;
        
        for (int i = 0; i < guardados.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < guardados.length; j++) {
                if (guardados[j] == guardados[i]) {
                    frecuencia++;
                }
            }
            if (frecuencia > frecuenciaModa) {
                frecuenciaModa = frecuencia;
                moda = guardados[i];
            }
        }
    System.out.println("La moda es: " + moda);
        

    
     
        }
  }
    

