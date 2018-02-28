package cap09;

import java.util.ArrayList;
import java.util.Scanner;

public class SalespersonSort {
	public static void main(String[] args) {
		ArrayList<Salesperson> dataBase = new ArrayList<Salesperson>();
		Integer noIdentificacion;
		Double ventas;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<7; i++) {
			
			System.out.println("Introduzca el ID: ");
			noIdentificacion = scanner.nextInt();
			System.out.println("Introduzca el valor de ventas: ");
			ventas = scanner.nextDouble();
			Salesperson temporal = new Salesperson(noIdentificacion, ventas);
			dataBase.add(temporal);
			System.out.println();
		}
		Salesperson temp;
		for(int i = 0; i<dataBase.size(); i++) {
			for(int j = 0 ; j<dataBase.size(); j++) {
				if(dataBase.get(j).getNoIdentificacion()>dataBase.get(i).getNoIdentificacion()) {
					temp = dataBase.get(j);
					dataBase.set(j, dataBase.get(i));
					dataBase.set(i, temp);
					
				}
			}
		}
		for(int i=0; i< dataBase.size(); i++) {
			System.out.println("ID: "+dataBase.get(i).getNoIdentificacion());
			System.out.println("VENTAS: "+dataBase.get(i).getVentas());
			System.out.println();
		}
		scanner.close();
	}
}
