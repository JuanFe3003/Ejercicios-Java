
package practica.pkg1.jf;
import java.util.Scanner;
/**
 *
 * @author Juan Felipe Ramirez Marquez 20251232655
 */
public class ejercicio3 {
    public static void main(String[] args){
       Scanner dato = new Scanner(System.in);
       double IVA = 0.19;
       double precio,total,subTotal;
       double descuento = 0;
       String marca;
       System.out.print("cual es el precio del aparato: $");
       precio = dato.nextDouble();
       System.out.print("que marca es el aparato: ");
       dato.nextLine();
       marca = dato.nextLine();
       if (precio>=500){
           descuento = descuento+0.1;
       }else{
           
       }
       if (marca.equals("nosy")){
           descuento = descuento+0.5;
       }else{
           
       }
       descuento = precio*descuento;
       subTotal = precio-descuento;
       IVA = subTotal*IVA;
       total = subTotal+IVA;
        System.out.print("El total a paagr es de: $"+total);  
    }
    
}
