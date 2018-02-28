
package cap09;

import java.util.Scanner;


public class EventDemo {

    private static String NEvent;
    private static int numberOfGuest;
    private static String phoneNum1;
    private static int eventType;
    public static void main(String[] args){
       
        
        Scanner in = new Scanner(System.in);
        
        
        Event eventArray[] = new Event[8];
        for(int i =0; i<eventArray.length; i++) {
        	 boolean condi = false;
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
            System.out.println("Enter the event type\n"
            		+ "0.- wedding\n"
            		+ "1.- baptism\n"
            		+ "2.- birthday\n"
            		+ "3.- corporate\n"
            		+ "4.-other");
            
            eventType = in.nextInt();
            in.nextLine();
            System.out.println("Enter the contact Phone Number for event 1");
            phoneNum1=in.nextLine();
            eventArray[i] = new Event(NEvent, numberOfGuest);
            eventArray[i].setPhoneNumber(phoneNum1);
            eventArray[i].setEventType(eventType);
            eventArray[i].display(numberOfGuest);
        }
        Integer centinela;
        do {
        	System.out.println("Como lo quieres ordenar\n"
    				+ "1.- Por numero de evento\n"
    				+ "2.- Por numero de invitados\n"
    				+ "3.- Por tipo de evento");
    		Integer opcion = in.nextInt();
    		switch (opcion) {
    		case 1:
    			ordenarEventNumber(eventArray);
    			break;
    		case 2:
    			ordenarNumberOfGuests(eventArray);
    			break;
    		case 3:
    			ordenarEventType(eventArray);
    			break;
    		default:
    			break;
    		}
    		for (int i=0; i<eventArray.length; i++) {
    			System.out.println("Numero de evento: "+eventArray[i].getEventNumber());
    			System.out.printf("Tipo de evento: %d, %s\n",eventArray[i].getEventType(),eventArray[i].getEventTypeString());
    			System.out.println("Numero de invitados: "+eventArray[i].getGuest());
    		}
        	System.out.println("Quiere seguir ordenando? 1.-si, 2.-NO");
        	centinela = in.nextInt();
        }while(centinela == 1);
		
        in.close();

   
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
	public static void ordenarEventType(Event arreglo[]) {
		Event temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getEventType().compareTo(temp.getEventType())>=0 )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
	public static void ordenarEventNumber(Event arreglo[]) {
		Event temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getEventNumber().compareTo(temp.getEventNumber())>=0 )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
	public static void ordenarNumberOfGuests(Event arreglo[]) {
		Event temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getGuest()> temp.getGuest() )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
}
