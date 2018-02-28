package cap09;

import java.util.Scanner;

public class Schedule {
	public static void main(String[] args) {
		String[][] horario = new String[2][4];
		Scanner scanner = new Scanner(System.in);
		String cursoABuscar;
		Boolean existe;
		System.out.println("Rellenando el horario");
		for(int i=0; i < 4; i++) {
			System.out.println("Ingresa nombre de curso (EJEM: CIS 110): ");
			horario[0][i] = scanner.nextLine();
			
			System.out.println("Ingresa el tiempo al que se da el curso (EJEM: Th 3:30) : ");
			horario[1][i] = scanner.nextLine();
			
		}
			existe = false;
			System.out.println("Ingresa nombre curso a buscar: ");
			cursoABuscar = scanner.nextLine();
			for(int i=0; i<4; i++) {
				if(cursoABuscar.compareTo(horario[0][i])==0) {
					existe = true;
					System.out.println("Hora a la que se da el curso : "+ horario[1][i]);
				}
			}
			if(!existe) {
				System.out.println("error curso con ese nombre no existe");
			}
			scanner.close();
		
	}
}
