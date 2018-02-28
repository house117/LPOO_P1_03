package cap09;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String diauser;
		String[][] dias = new String[2][7];
		dias[0][0] = "Lunes";
		dias[0][1] = "Martes";
		dias[0][2] = "Miercoles";
		dias[0][3] = "Jueves";
		dias[0][4] = "Viernes";
		dias[0][5] = "Sabado";
		dias[0][6] = "Domingo";
		for(int i=0;i<5;i++) {
			dias[1][i] = "9 to 9";
		}
		dias[1][5] = "10 to 6";
		dias[1][6] = "11 to 5";
		
		System.out.println("Introduce un dia a la semana");
		diauser = scanner.nextLine();
		for(int i = 0; i<7; i++) {
			if(diauser.compareTo(dias[0][i]) == 0) {
				System.out.println("HORARIO DE SERVICIO EN ESE DIA: "+dias[1][i]);
			}
		}
		scanner.close();
		
	}
	
}
