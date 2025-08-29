
package practica.pkg1.jf;
import java.util.Scanner;
/**
 *
 * @author Juan Felipe Ramirez Marquez 20251232655
 */
public class ejercicio2 {
    public static void main(String[] args){
        short numLlanta;
        double precio,total;
        Scanner dato = new Scanner(System.in);
        System.out.print("ingrese cantidad de llantas: ");
        numLlanta = dato.nextShort();
        if (numLlanta<5){
            precio = 100;
        } else if (5<=numLlanta && numLlanta<10){
            precio = 75;
        } else {
            precio = 50;
        }
        total = numLlanta*precio;
        System.out.print("El total a pagar es de : $"+total+" y el valor de cada llanta es de: $"+precio);
        
    }
    
}
