/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.util.Scanner;

/**
 *
 * @author bautista
 */
public class RentalDemo {
    private static String ContNum1;
    private static int min1;
    private static String ContNum2;
    private static int min2;
    private static String ContNum3;
    private static int min3;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Contract Number 1");
        ContNum1=in.nextLine();
        System.out.println("Enter the minutes 1");
        min1=in.nextInt();
        in.nextLine();
        Rental object1 = new Rental(ContNum1, min1);
        object1.display(min1);
        System.out.println("Enter the Contract Number 2");
        ContNum2=in.nextLine();
        System.out.println("Enter the minutes 2");
        min2=in.nextInt();
        in.nextLine();
        Rental object2 = new Rental(ContNum2, min2);
        object2.display(min2);
        System.out.println("Enter the Contract Number 3");
        ContNum3=in.nextLine();
        System.out.println("Enter the minutes 3");
        min3=in.nextInt();
        in.nextLine();
        Rental object3 = new Rental(ContNum3, min3);
        object3.display(min3);
         System.out.println();
         System.out.println("COMPARACION 1 Y 2");
        compare(min1, min2);
        System.out.println();
        System.out.println("COMPARACION 2 Y 3");
        compare(min2, min3);
        System.out.println();
        System.out.println("COMPARACION 1 Y 3");
        compare(min1, min3);
    }
    public static void compare(int x, int y){
        RentalDemo prueba = new RentalDemo();
        if(x==y){
            System.out.println("\nThe rental times are same "+ prueba.ContNum1+ "and "+prueba.ContNum2+" and the number of minutes are "+ x);
        }else if(x>y){
            System.out.println("The long time is"+ prueba.ContNum1+  "\n  and the number of minutes are "+ x + " \n Hours :"+ x/60+" \nMinutes "+x%60);
        }else {
            System.out.println("The long time  is "+ prueba.ContNum2+ " \n and the number of minutes are "+ y+ " \n Hours :"+ y/60+" \nMinutes "+y%60);
        }
    }
}
