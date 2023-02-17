package TercerEjerc;

import java.util.*;

/**
 *
 * @author luisv
 */
public class Pro3D {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Generamos un número aleatorio hasta 23
    int n = (int) (Math.random() * 23 + 1);

    System.out.println("Número aleatorio generado: " + n);

    // Creamos un arreglo para guardar los productos
    String[] nombres = new String[n];
    int[] cantidad = new int[n];
    int[] precios = new int[n];

    // Pedimos al usuario que ingrese los datos de los productos
    int i = 0;
    for (String j : nombres) {
        System.out.println("Ingresa los datos del producto " + (i + 1) + ":");
        System.out.print("Nombre: ");
        nombres[i] = sc.nextLine();

        //Limitamos las unidades a 15
        do {
            System.out.print("Cantidad: (Limite de 15 unidades) ");
            cantidad[i] = sc.nextInt();
        } while (cantidad[i] > 15);

        System.out.print("Precio: ");
        precios[i] = sc.nextInt();
        sc.nextLine(); // Limpiamos la casa

        i++;
    }

    // Mostramos los datos de los productos ingresados
    System.out.println("Lista de productos:");
    int total = 0;
    i = 0;
    for (String j : nombres) {
        System.out.println((i + 1) + ". " + nombres[i] + " - " + cantidad[i] + " unidades - $" + precios[i]);
        total += cantidad[i] * precios[i];
        i++;
    }

    // Mostramos el precio total de los productos
    System.out.println("Precio total: $" + total);
    }
}   
