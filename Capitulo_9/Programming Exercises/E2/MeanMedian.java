package cap09;

import java.util.Scanner;

public class MeanMedian {
	public static void main(String[] args) {
		Integer[] arreglo = new Integer[5];
		Integer temp;
		Integer a = 1;
		Integer b;
		Double suma = 0.0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<arreglo.length; i++) {
			System.out.printf("Ingresa el dato %d: ", i);
			arreglo[i] = scanner.nextInt();
		}
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b] > temp )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp;
			a++;
		}
		
		for(int i = 0; i<arreglo.length; i++) {
			suma+=arreglo[i];
		}
		System.out.println("Media : "+suma/arreglo.length);
		System.out.println("Mediana : "+arreglo[2]);
		scanner.close();
	}
}
