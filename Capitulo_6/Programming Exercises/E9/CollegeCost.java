package collegecost;

import java.util.Scanner;

public class CollegeCost {

    public static void main(String[] args) {
        int edad;
	int costo;
	int dif;
		
        Scanner sc=new Scanner(System.in);
	
        System.out.println("Edad de la bendicion");
	edad = sc.nextInt();
		
        System.out.println("Costo del cole");
	costo= sc.nextInt();

        while (edad>=18){
            System.out.println("La edad no es valida");
            System.out.print("La edad debe ser menor de 18\nIntente. ");
            edad=sc.nextInt();
	}

	dif=18-edad;
        int pago = costo/dif;
		
	System.out.println("Tienes que guardar $" + pago + " por anio");
    }
    
}
