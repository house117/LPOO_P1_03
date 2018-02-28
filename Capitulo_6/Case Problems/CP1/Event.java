package eventdemo;

public class Event {
    public static int pricePerGuest;
    public final static int lowerPricePerGuest =32;
    public final static int higherPricePerGuest =35;
    public final static int cutOfValue = 50;
    
    private String eventNumber = "A000";
    private int guest;
    private int price;
    
    Event(){
        
    }
    Event (String eventNumber, int guest){
        this.eventNumber= eventNumber;
        this.guest= guest;
        setEventNumber(eventNumber);
        setGuest(guest);
    }
    public boolean isLargeEvent(int guest){
        if(guest>=50){
            return true;
        }else{ 
            return false;
        }
    }
    public void display(int guest){
        boolean value = isLargeEvent(guest);
        int cost = setGuest(guest);
        if(value==true){
            System.out.println("\n\nIts a large event\n Number of guest: "+guest+"\nThe price per guest is: "+lowerPricePerGuest+"\nTotal: "+cost);
        }else{
            System.out.println("\n\nIts a small event\n Number of guest: "+guest+"\nThe price per guest is: "+higherPricePerGuest+"\nTotal: "+cost);
        }
        System.out.println();
        for(int i=0;i<guest;i++){
            System.out.println("Please come to my event!”");
        }
    }

     public String getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public int getGuest() {
        return guest;
    }

    public int setGuest(int guest) {
        this.guest = guest;
        if(this.guest<50){
            price = guest*higherPricePerGuest;
        }else{
            price = guest*lowerPricePerGuest;
        }
        return price;
    }
    public int getPrice(){
        return price;
    }
    public static int getPriceperguest(){
        return pricePerGuest;
    }

}
