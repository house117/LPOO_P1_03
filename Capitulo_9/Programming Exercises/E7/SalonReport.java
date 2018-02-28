package cap09;

import java.util.Scanner;

public class SalonReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Services salon[] = new Services[6];
		salon[0] = new Services("Cut", 8.00, 15);
		salon[1] = new Services("Shampoo", 4.00, 10);
		salon[2] = new Services("Manicure", 18.0, 30);
		salon[3] = new Services("Style", 48.0, 55);
		salon[4] = new Services("Permanent", 18.0, 35);
		salon[5] = new Services("Trim", 6.0, 5);
		System.out.println("Como lo quieres ordenar\n"
				+ "1.- Por descripcion\n"
				+ "2.- Por precio\n"
				+ "3.- Por tiempo");
		Integer opcion = scanner.nextInt();
		switch (opcion) {
		case 1:
			ordenarDescri(salon);
			break;
		case 2:
			ordenarPrecio(salon);
			break;
		case 3:
			ordenarTiempo(salon);
			break;
		default:
			break;
		}
		System.out.println();
		for(int i =0; i<salon.length; i++) {
			System.out.println("DESCRIPCION: "+ salon[i].getDes());
			System.out.println("PRECIO : "+salon[i].getPrice());
			System.out.println("TIEMPO: "+salon[i].getMinu());
			System.out.println();
		}
		scanner.close();
	}
	public static void ordenarDescri(Services arreglo[]) {
		Services temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getDes().compareTo(temp.getDes())>=0 )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
	public static void ordenarPrecio(Services arreglo[]) {
		Services temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getPrice() > temp.getPrice() )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
	public static void ordenarTiempo(Services arreglo[]) {
		Services temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getMinu()> temp.getMinu() )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
}
