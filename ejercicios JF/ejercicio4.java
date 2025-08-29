package practica.pkg1.jf;

import java.util.Scanner;

/**
 *
 * @author Juan Felipe Ramirez Marquez 20251232655
 */
public class ejercicio4 {

    public static void main(String[] args) {
        double peso, descuento, total, subTotal;
        double precio = 1;
        Scanner dato = new Scanner(System.in);
        System.out.print("precio manzana: 1$ x kilo. Cual es el peso(kg) registrado?: ");
        peso = dato.nextDouble();
        subTotal = precio * peso;
        if (0 < peso && peso <= 2) {
            descuento = 0;
        } else if (2 < peso && peso <= 5) {
            descuento = subTotal * 0.1;

        } else if (5 < peso && peso <= 10) {
            descuento = subTotal * 0.15;

        } else {
            descuento = subTotal * 0.2;
        }
        total = subTotal - descuento;
        System.out.print("el total de la compra de manzanas es de: $" + total);
    }

}
