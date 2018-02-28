/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap08;

import java.util.Scanner;


public class RentalDemo {
    private static String ContNum1;
    private static int min1;
    private static String phoneNumber1;
    private static int equipmentType;
    
    public static void main(String[] args){
        Rental[] rentalArray = new Rental[3];
        Scanner in = new Scanner(System.in);
        
        for(int i=0; i< rentalArray.length; i++) {
        	rentalArray[i] = new Rental();
            System.out.println("Enter the Contract Number ");
            ContNum1=in.nextLine();
            System.out.println("Enter the contact Phone Number");
            phoneNumber1=in.nextLine();
            System.out.println("Enter the minutes ");
            min1=in.nextInt();
            System.out.println("Enter the equipment type: \n"
            		+ "0.-jet ski\n"
            		+ "1.-pontoon boat\n"
            		+ "2.-rowboat\n"
            		+ "3.-canoe\n"
            		+ "4.-kayak\n"
            		+ "5.-beach chair\n"
            		+ "6.-umbrella\n"
            		+ "7.-other\n");
            equipmentType = in.nextInt();
            rentalArray[i].setMinutes(min1);
            rentalArray[i].setContractNumber(ContNum1);
            rentalArray[i].setEquipmentType(equipmentType);
            rentalArray[i].setPhoneNumber(phoneNumber1);
            rentalArray[i].display(min1);
            in.nextLine();
        }

        in.close();
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
