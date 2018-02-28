
package bargraph;

import java.util.Scanner;

public class BarGraph {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pam,Leo,Kim,Bob;
        System.out.print("Autos vendidos de Pam: ");
        Pam = sc.nextInt();
        System.out.print("Autos vendidos de Leo: ");
        Leo = sc.nextInt();
        System.out.print("Autos vendidos de Kim: ");
        Kim = sc.nextInt();
        System.out.print("Autos vendidos de Bob: ");
        Bob = sc.nextInt();
        System.out.print("\nCarros vendidos:\nPam: ");
        for(int i=0;i<Pam;i++){
            System.out.print("X");
        }
        System.out.print("\nLeo: ");
        for(int i=0;i<Leo;i++){
            System.out.print("X");
        }
        System.out.print("\nKim: ");
        for(int i=0;i<Kim;i++){
            System.out.print("X");
        }
        System.out.print("\nBob: ");
        for(int i=0;i<Bob;i++){
            System.out.print("X");
        }
        System.out.println("\n\n");
    }
    
}
