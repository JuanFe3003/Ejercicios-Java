
package practica.pkg1.jf;
import java.util.Scanner;
/**
 *
 * @author Juan Felipe Ramirez Marquez 20251232655
 */
public class ejercicio3 {
    public static void main(String[] args){
        double descuento = 0;
        double precio, IVA,subTotal,total,descuentoFinal;
        String marca;
        Scanner dato = new Scanner(System.in);
        System.out.print("Cual es el precio del producto: ");
        precio = dato.nextDouble();
        System.out.print("Que marca es el producto: ");
        dato.nextLine();
        marca = dato.nextLine();
        if (precio >= 500){
            descuento = 0.1;
        }  else {
            
        }   
        if (marca.equals("NOSY")){
            descuento = descuento+0.05;   
        } else {
            
        }
        descuento = precio*descuento;
        descuentoFinal = precio-descuento;
        IVA = precio*0.19;
        subTotal = (precio+IVA);
        total = subTotal-descuentoFinal;
        System.out.print("El total a pagar es de: $"+total);
    }
    
}
