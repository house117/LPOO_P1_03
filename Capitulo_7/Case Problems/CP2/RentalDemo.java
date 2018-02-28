/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.util.Scanner;


public class RentalDemo {
    private static String ContNum1;
    private static int min1;
    private static String phoneNumber1;
    private static String ContNum2;
    private static int min2;
    private static String phoneNumber2;
    private static String ContNum3;
    private static int min3;
    private static String phoneNumber3;
    
    public static void main(String[] args){
        Rental o1 = new Rental();
        Rental o2 = new Rental();
        Rental o3 = new Rental();
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter the Contract Number 1");
        ContNum1=in.nextLine();
        o1.setContractNumber(ContNum1);
        System.out.println("Enter the minutes 1");
        min1=o1.okMinutes();
        o1.setMinutes(min1);
        System.out.println("Enter the contact Phone Number");
        phoneNumber1=in.nextLine();
        o1.setPhoneNumber(phoneNumber1);
        o1.display(min1);
        
        
        System.out.println("\n\nEnter the Contract Number 2");
        ContNum2=in.nextLine();
        o2.setContractNumber(ContNum2);
        System.out.println("Enter the minutes 2");
        min2=o2.okMinutes();
        o2.setMinutes(min2);
        System.out.println("Enter the contact Phone Number");
        phoneNumber2=in.nextLine();
        o2.setPhoneNumber(phoneNumber2);
        o2.display(min2);
        
        
        System.out.println("\n\nEnter the Contract Number 3");
        ContNum3=in.nextLine();
        o3.setContractNumber(ContNum3);
        System.out.println("Enter the minutes 3");
        min3=o3.okMinutes();
        o3.setMinutes(min3);
        System.out.println("Enter the contact Phone Number");
        phoneNumber3=in.nextLine();
        o3.setPhoneNumber(phoneNumber3);
        o3.display(min3);
         
        System.out.println(); 
        System.out.println("COMPARACION 1 Y 2");
        compare(o1, o2);
        System.out.println();
        System.out.println("COMPARACION 2 Y 3");
        compare(o2, o3);
        System.out.println();
        System.out.println("COMPARACION 1 Y 3");
        compare(o1, o3);
    }
    public static void compare(Rental x, Rental y){
        if(x.getMinutes()==y.getMinutes()){
            System.out.println("\nThe rental times are same "+ x.getContractNumber()+ "and "+y.getContractNumber()+" and the number of minutes are "+ x.getMinutes());
        }else if(x.getMinutes()>y.getMinutes()){
            System.out.println("The long time is"+ x.getContractNumber()+  "\n  and the number of minutes are "+ x.getMinutes() + " \n Hours :"+ x.getMinutes()/60+" \nMinutes "+x.getMinutes()%60);
        }else {
            System.out.println("The long time  is "+ y.getContractNumber()+ " \n and the number of minutes are "+ y.getMinutes()+ " \n Hours :"+ y.getMinutes()/60+" \nMinutes "+y.getMinutes()%60);
        }
    }
}
