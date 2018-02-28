package inbetween;

import java.util.Scanner;

public class InBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	System.out.print("Valor 1: ");
        int v1=sc.nextInt();
        System.out.print("Valor 2: ");
        int v2=sc.nextInt();
		
	if(v1>v2){
            for (int i=v2;i<=v1;i++){
		System.out.print(i+"  ");
            }
        }else if(v2>v1){
            for (int i=v1;i<=v2;i++){
		System.out.print(i+"  ");
            }
        }else if(v1==v2){
		System.out.print("Los valores son iguales");
        }else{
            System.out.print("Fatal Error");
        }

	System.out.println();
    }
    
}
