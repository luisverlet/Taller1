package SegundoEjerc;

import java.util.*;

public class Pro2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generamos un numero aleatorio
        int NumeroAl = (int) Math.floor(Math.random() * 53 + 1);
        System.out.println("El número aleatorio es: " + NumeroAl);

        // Pedimos los números al usuario
        int[] guardados = new int[NumeroAl];
        int i = 0;
        for (int h : guardados) {
            System.out.print("Introduce un número: ");
            guardados[i] = sc.nextInt();
            i++;
        }

        // Calculamos la media
        int suma = 0;
        for (int num : guardados) {
            suma = num;
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
        for (int num : guardados) {
            int frecuencia = 0;
            for (int j = 0; j < guardados.length; j++) {
                if (guardados[j] == num) {
                    frecuencia++;
                }
            }
            if (frecuencia > frecuenciaModa) {
                frecuenciaModa = frecuencia;
                moda = num;
            }
        }
        System.out.println("La moda es: " + moda);
    }
}
