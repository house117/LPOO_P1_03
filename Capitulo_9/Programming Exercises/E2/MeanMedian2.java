package cap09;

import java.util.Scanner;

public class MeanMedian2 {
	public static void main(String[] args) {

		Integer temp;
		Integer a = 1;
		Integer b;
		Double suma = 0.0;
		Integer numeroElementos;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el numero de elementos(maximo 20): ");
		numeroElementos = scanner.nextInt();
		if(numeroElementos<=20){
			Integer[] arreglo = new Integer[numeroElementos];
			for(int i = 0; i<arreglo.length; i++) {
				System.out.printf("Ingresa el dato %d: ", i+1);
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
			Double mediana;
			if(arreglo.length%2 == 0) {
				mediana = ((arreglo.length/2) + ((arreglo.length/2)+1))/2.0;
			}else {
				mediana = arreglo.length/2.0;
			}
				
			System.out.println("Mediana : "+mediana);
			scanner.close();
		}else {
			System.out.println("MAXIMO 20");
		}
		
	}
}
