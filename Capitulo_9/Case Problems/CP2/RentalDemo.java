/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap09;

import java.util.Scanner;


public class RentalDemo {
    private static String ContNum1;
    private static int min1;
    private static String phoneNumber1;
    private static int equipmentType;
    
    public static void main(String[] args){
        Rental[] rentalArray = new Rental[8];
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
        Integer centinela;
        do {
        	System.out.println("Como lo quieres ordenar\n"
    				+ "1.- Por numero de contrato\n"
    				+ "2.- Por precio\n"
    				+ "3.- Por tipo de equipo\n");
    		Integer opcion = in.nextInt();
    		switch (opcion) {
    		case 1:
    			ordenarContractNumber(rentalArray);
    			break;
    		case 2:
    			ordenarPrice(rentalArray);
    			break;
    		case 3:
    			ordenarEquipmentType(rentalArray);
    			break;
    		default:
    			break;
    		}
    		for (int i=0; i<rentalArray.length; i++) {
    			System.out.println("Numero de contrato: "+rentalArray[i].getContractNumber());
    			System.out.printf("Tipo de equipo: %d, %s\n",rentalArray[i].getEquipmentType(), rentalArray[i].getEquipmentTypeString());
    			System.out.println("Precio: "+rentalArray[i].getPrice());
    		}
        	System.out.println("Quiere seguir ordenando? 1.-si, 2.-NO");
        	centinela = in.nextInt();
        }while(centinela == 1);
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
public static void ordenarContractNumber(Rental arreglo[]) {
	Rental temp;
	Integer a = 1;
	Integer b;
	while(a < arreglo.length) {
		temp = arreglo[a];
		b = a-1;
		while(b >= 0 && arreglo[b].getContractNumber().compareTo(temp.getContractNumber())>=0 )
		{
			arreglo[b + 1] = arreglo[b];
			--b;
		}
		arreglo[b+1] = temp; 
		a++;
	}
}
public static void ordenarPrice(Rental arreglo[]) {
	Rental temp;
	Integer a = 1;
	Integer b;
	while(a < arreglo.length) {
		temp = arreglo[a];
		b = a-1;
		while(b >= 0 && arreglo[b].getPrice().compareTo(temp.getPrice())>=0 )
		{
			arreglo[b + 1] = arreglo[b];
			--b;
		}
		arreglo[b+1] = temp; 
		a++;
	}
}
public static void ordenarEquipmentType(Rental arreglo[]) {
	Rental temp;
	Integer a = 1;
	Integer b;
	while(a < arreglo.length) {
		temp = arreglo[a];
		b = a-1;
		while(b >= 0 && arreglo[b].getEquipmentType().compareTo(temp.getEquipmentType())>=0)
		{
			arreglo[b + 1] = arreglo[b];
			--b;
		}
		arreglo[b+1] = temp; 
		a++;
	}
}
}
