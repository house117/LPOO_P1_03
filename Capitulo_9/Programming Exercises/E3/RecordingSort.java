package cap09;

import java.util.Scanner;

public class RecordingSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Recording[] arreglo = new Recording[5];
		Integer opcion;
		String titulo, nombreArtista;
		Integer duracion;
		for(int i=0; i<arreglo.length; i++) {
			System.out.printf("Ingresa titulo para cancion %d: ",i+1);
			titulo = scanner.nextLine();
			System.out.printf("Ingresa nombre de artista para cancion %d: ",i+1);
			nombreArtista = scanner.nextLine();
			System.out.printf("Ingresa duracion en segundos para cancion %d: ",i+1);
			duracion = scanner.nextInt();
			arreglo[i] = new Recording(titulo, nombreArtista, duracion);
			scanner.nextLine();

		}
		System.out.println("Por qué elemento deseas ordenar el array?");
		System.out.println("1.-Titulo de la canción");
		System.out.println("2.-Nombre del artista");
		System.out.println("3.-Tiempo de duracion de la cancion");
		System.out.print("Ingresa seleccion: ");
		opcion = scanner.nextInt();
		switch(opcion) {
		case 1:
			Recording temp;
			Integer a = 1;
			Integer b;
			while(a < arreglo.length) {
				temp = arreglo[a];
				b = a-1;
				while(b >= 0 && arreglo[b].getTitle().compareTo(temp.getTitle())>=0 )
				{
					arreglo[b + 1] = arreglo[b];
					--b;
				}
				arreglo[b+1] = temp; 
				a++;
			}
			break;
		case 2:
			Recording temp2;
			Integer a2 = 1;
			Integer b2;
			while(a2 < arreglo.length) {
				temp2 = arreglo[a2];
				b2 = a2-1;
				while(b2 >= 0 && arreglo[b2].getArtist().compareTo(temp2.getArtist())>=0 )
				{
					arreglo[b2 + 1] = arreglo[b2];
					--b2;
				}
				arreglo[b2+1] = temp2; 
				a2++;
			}
			break;
		case 3:
			Recording temp3;
			Integer a3 = 1;
			Integer b3;
			while(a3 < arreglo.length) {
				temp3 = arreglo[a3];
				b3 = a3-1;
				while(b3 >= 0 && arreglo[b3].getPlayingTime() > temp3.getPlayingTime() )
				{
					arreglo[b3 + 1] = arreglo[b3];
					--b3;
				}
				arreglo[b3+1] = temp3;
				a3++;
			}
			break;
		default:
			System.out.println();	
		}
	System.out.println();
		for(int i = 0; i < arreglo.length ; i++) {
			System.out.printf("Titulo cacion %d: %s%n", i, arreglo[i].getTitle());
			System.out.printf("Nombre artista cacion %d: %s%n", i, arreglo[i].getArtist());
			System.out.printf("Duracion %d: %d%n", i, arreglo[i].getPlayingTime());
			System.out.println();
		}
		scanner.close();
	}
}
