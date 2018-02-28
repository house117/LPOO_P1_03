package condosales2;

import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args) {
        Integer number;
        boolean i=false;
        int price = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a number:\n1.- Park View\n2.- Glof Course View\n3.- Lake View: ");
	number = in.nextInt();
        if(number==1){
                 i=true;  
                 price = 150000;
                System.out.println("Chosen View: Park view \nPrice Of the Condo: $150,000");
        }else if(number ==2){
                i=true;
                price=170000;
                System.out.println("Chosen View: golf course views \nPrice Of the Condo: $170,000");
        }else if(number==3){
                i=true;
                price=210000;
                System.out.println("Chosen View: Lake views \nPrice of The Condo: $210,000");
        }else{
                i=false;
                
                System.out.println("Chosen View: Incorrect \nPrice Of the Condo: $0");
        
        }
        
        if(i){
              System.out.println("Enter Details if Required\n1)Garage\n2)Parking Space\n");
             int additionalChoice=in.nextInt();

             if(additionalChoice==1||additionalChoice==2)
           {

                  price+=5000;

                  System.out.println("Total Cost = $"+price+" \n");

           }

           else

           {

               System.out.println("Total Cost =$"+price+"\n");

           }        
        }
    
    }
    
}
