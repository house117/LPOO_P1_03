package evenentryloop;

import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        while(v!=999){
            System.out.print("Valor Par: ");
            v = sc.nextInt();
            if(v%2==0){
                System.out.println("Good job!");
            }else{
                System.out.println("Fatal Error");
            }
        }
    }
    
}
