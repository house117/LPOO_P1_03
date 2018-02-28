
package createpurchase;

import java.util.Scanner;

public class CreatePurchase {

    public static void main(String[] args) {
        int fact;
        double venta;
        Purchase miCosa = new Purchase();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero de factura: ");
        fact = sc.nextInt();
        System.out.print("Cant. de venta: $");
        venta = sc.nextDouble(); 
        venta *= 100;
        venta +=0.5;
        venta = (int)venta;
        venta /= 100;
      
        while (fact < 1000 || fact> 8000){
            System.out.println("Numero erroneo, " + 
                    "\nIngrese de nuevo (entre 1000 y 8000): ");
            fact = sc.nextInt(); 
        }
      
        while (venta < 0){
            System.out.println("Numero erroneo,"+
                    "\nIngrese un dato mayor a 0: ");
            venta = sc.nextDouble();
        }
   
      
        miCosa.setNumFact(fact);
        miCosa.setMontoVenta(venta);
        miCosa.resultados();
    }
    
}
