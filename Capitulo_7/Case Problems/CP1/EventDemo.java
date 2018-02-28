
package eventdemo;

import java.util.Scanner;


public class EventDemo {

    private static String NEvent;
    private static int numberOfGuest;
    private static String phoneNum1;
    private static String NEvent1;
    private static int numberOfGuest1;
    private static String phoneNum2;
    
    public static void main(String[] args){
        boolean condi = false;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the event number");
        NEvent=in.nextLine();
        
        do{
            if(condi){
                System.out.println("Los invitados deben ser >5 y <100");
            }
            System.out.println("Enter the number of guest (>5 & <100)");
            numberOfGuest=in.nextInt();
            condi = true;
        }while(numberOfGuest <5 || numberOfGuest > 100);
        
        in.nextLine();
        System.out.println("Enter the contact Phone Number for event 1");
        phoneNum1=in.nextLine();
        
        
        System.out.println("Enter the event number 2");
        NEvent1=in.nextLine();
        
        condi = false;
        do{
            if(condi){
                System.out.println("Los invitados deben ser >5 y <100");
            }
            System.out.println("Enter the number of guest 2 (>5 & <100)");
            numberOfGuest1=in.nextInt();
            condi = true;
        }while(numberOfGuest1 <5 || numberOfGuest1 > 100);
        
        in.nextLine();
        System.out.println("Enter the contact Phone Number for event 2");
        phoneNum2=in.nextLine();
        
        
        Event object1 = new Event(NEvent, numberOfGuest);
        object1.setPhoneNumber(phoneNum1);
        object1.display(numberOfGuest);
        
        Event object2 = new Event(NEvent1, numberOfGuest1);
        object1.setPhoneNumber(phoneNum1);
        object2.display(numberOfGuest1);
        
        compare (object1, object2);
        
    }
    
    
    public static void compare(Event evento1, Event evento2){
         
        if(evento1.getGuest()==evento2.getGuest()){
            System.out.println("The events are same "+ evento1.getEventNumber()+ " and "+evento2.getEventNumber()+" and the number of guests are "+evento1.getGuest());
        }else if(evento1.getGuest()>evento2.getGuest()){
            System.out.println("The Larger event is"+ evento1.getEventNumber()+  " and the number of guests are "+ evento1.getGuest());
        }else {
            System.out.println("The Larger event is "+ evento2.getEventNumber()+ " and the number of guests are "+ evento2.getGuest());
        }
    }
}
