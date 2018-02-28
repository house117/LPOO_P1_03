
package createbabysittingjob;

import java.util.Scanner;

public class CreateBabysittingJob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condi = false;
        int yyyy;
        int idTra;
        int numTra = 0;
        int empleado = 0;
        int bendiciones = 0;
        int nH = 0;

        
        do{
            if (condi){
                System.out.println("El anio debe ser entre 2013 y 2025.");
            }
            System.out.print("Anio (2013-2025): ");
            yyyy = sc.nextInt();
            condi = true;
        }while (yyyy < 2013 || yyyy > 2025);
        
        condi = false;
        do{
            if (condi){
                System.out.println("El dato debe estar en el rango de 0 y 9999.");
            }
            System.out.print("Numero de trabajo (0-9999): ");
            numTra = sc.nextInt();
            condi = true;
        }while (numTra < 0 || numTra > 9999);

        condi = false;
        do{
            if (condi){
                System.out.println("Solo hay un rango de 1 a 3 en ID");
            }
            System.out.print("ID empleado (1-3): ");
            empleado = sc.nextInt();
            condi = true;
        }while (empleado < 1 || empleado > 3);

        condi = false;
        do{
            if (condi){
                System.out.println("Son aceptados desde 1 a 9 ninios. No mas no menos");
            }
            System.out.print("Numero de ninios (1-9): ");
            bendiciones = sc.nextInt();
            condi = true;
        }while (bendiciones < 1 || bendiciones > 9);

        condi = false;
        do{
            if (condi){
                System.out.println("Solo laboramos 12 horas");
            }
            System.out.print("Numero de horas (1-12): ");
            nH = sc.nextInt();
            condi = true;
        }while (nH < 1 || nH > 12);

        

        idTra = BabysittingJob.nuevoidJob(yyyy,numTra);

        BabysittingJob prueba = new BabysittingJob(idTra, empleado, bendiciones, nH);
        prueba.resultados();
    }
    
}
