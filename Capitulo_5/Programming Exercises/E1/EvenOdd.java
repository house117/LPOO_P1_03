package evenodd;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Integer number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
	number = in.nextInt();
        if((number%2)==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
		

    }
    
}
