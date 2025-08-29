package practica.pkg1.jf;

import java.util.Scanner;

/*
Author: Juan Felipe Ramirez Marquez 20251232655
 */
public class Practica1JF {

    public static void main(String[] args) {
        short numEquipo;
        double total, subTotal, descuento;
        double precio = 500;

        Scanner dato = new Scanner(System.in);
        System.out.print("ingrese el numero de equipos: ");
        numEquipo = dato.nextShort();
        subTotal = precio * numEquipo;
        if (numEquipo < 5) {
            descuento = subTotal * 0.1;
            total = subTotal - descuento;
            System.out.println("el total es de: $" + total);
        } else if (5 <= numEquipo && numEquipo < 10) {
            descuento = subTotal * 0.2;
            total = subTotal - descuento;
            System.out.println("el total es de: $" + total);
        } else if (numEquipo < 0) {
            System.out.print("numero erroneo, vuelva a intentar");
        } else {
            descuento = subTotal * 0.4;
            total = subTotal - descuento;
            System.out.println("el total es de: $" + total);
        }

    }

}
