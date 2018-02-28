package cap09;

import java.util.ArrayList;
import java.util.Scanner;

public class SalespersonDataBase {
	public static void main(String[] args) {
		ArrayList<Salesperson> dataBase = new ArrayList<Salesperson>();
		Integer continuar, opcion;
		Scanner scanner = new Scanner(System.in);
		Integer noIdentificacion;
		Double ventas;
		Boolean encontrado;
		do {
			encontrado = false;
			System.out.println("Seleccione la opcion");
			System.out.println("1.- Agregar campo\n"+
								"2.- Eliminar campo\n"+
								"3.- Modificar campo\n");
			opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				if(dataBase.size() >= 20) {
					System.out.println("La base de datos esta llena, elimine un dato");
				}else {
					System.out.println("Introduzca el ID: ");
					noIdentificacion = scanner.nextInt();
					for(int i = 0; i<dataBase.size(); i++) {
						if(noIdentificacion - dataBase.get(i).getNoIdentificacion() == 0) {
							encontrado = true;
						}
					}
					if(!encontrado) {
						System.out.println("Introduzca el valor de ventas: ");
						ventas = scanner.nextDouble();
						Salesperson temporal = new Salesperson(noIdentificacion, ventas);
						dataBase.add(temporal);
					}else {
						System.out.println("ID ya existente, intente otro");
					}
				}
				break;
			case 2:
				if(dataBase.isEmpty()) {
					System.out.println("La base de datos está vacia");
				}else {
					System.out.println("Introduzca el ID: ");
					noIdentificacion = scanner.nextInt();
					for(int i = 0; i<dataBase.size(); i++) {
						if(noIdentificacion - dataBase.get(i).getNoIdentificacion() == 0) {
							encontrado = true;
							dataBase.remove(i);
							System.out.printf("Elemento con id %d eliminado\n",noIdentificacion);
						}
					}
					if(!encontrado) {
						System.out.println("El ID no existe en la base de datos");
					}
				}
				break;
			case 3:
				if(dataBase.isEmpty()) {
					System.out.println("La base de datos está vacia");
				}else {
					System.out.println("Introduzca el ID: ");
					noIdentificacion = scanner.nextInt();
					for(int i = 0; i<dataBase.size(); i++) {
						if(noIdentificacion - dataBase.get(i).getNoIdentificacion() == 0) {
							encontrado = true;
							
							System.out.print("Introduzca nuevo dato para valor ventas: ");
							dataBase.get(i).setVentas(scanner.nextDouble());
						}
					}
					if(!encontrado) {
						System.out.println("El ID no existe en la base de datos");
					}
				}
				break;
				default:
					System.out.println("Numero incorrecto");
			}
			Salesperson temp;
			//ORDENAR
			for(int i = 0; i<dataBase.size(); i++) {
				for(int j = 0 ; j<dataBase.size(); j++) {
					if(dataBase.get(j).getNoIdentificacion()<dataBase.get(i).getNoIdentificacion()) {
						temp = dataBase.get(j);
						dataBase.set(j, dataBase.get(i));
						dataBase.set(i, temp);
						
					}
				}
			}
			System.out.println();
			System.out.println("BASE DE DATOS : ");
			for(int i=0; i< dataBase.size(); i++) {
				System.out.println("ID: "+dataBase.get(i).getNoIdentificacion());
				System.out.println("VENTAS: "+dataBase.get(i).getVentas());
				System.out.println();
			}
			System.out.println("Desea continuar 1.- SI/ 2.- NO");
			continuar = scanner.nextInt();
		}while(continuar == 1);
		scanner.close();
	}
}
