
package retirementgoal2;

import java.util.Scanner;
public class RetirementGoal2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio;
        double ahorro;
      
        do {
            System.out.print("Anios antes de su retiro: ");
            anio = sc.nextInt();
      
            System.out.print("Ahorro anual estimado: ");
            ahorro = sc.nextDouble();
         
            if (anio < 1 || ahorro <= 0){
                System.out.println();
                System.out.println("ERROR: Ingresa los datos de nuevo.");
                System.out.println();
            }
        }while (anio < 1 || ahorro <= 0);
        
        for (int x = 1; x <= anio; x++) {
            for (int y = 0; y < x; y++)
                ahorro += (ahorro * 0.05);
        }
        
        System.out.println("\nTienes que ahorrar $"+(anio * ahorro));
    }
    
}
