package cap08;

public class Event {
    public static int pricePerGuest;
    public final static int lowerPricePerGuest =32;
    public final static int higherPricePerGuest =35;
    public final static int cutOfValue = 50;
    
    private String eventNumber = "A000";
    private int guest;
    private int price;
    private String phoneNumber="0000000000";
    private Integer eventType = 4;
    public final static String[] EVENTTYPEARRAY = {"wedding", "baptism", "birthday", "corporate", "other"};
   
    
    //Default constructor
    Event(){
        
    }
    Event (String eventNumber, int guest){
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
        System.out.println("\nEvent Type : "+EVENTTYPEARRAY[eventType]);
        if(value==true){
            System.out.println("\n\n"+getEventNumber()+"\nIts a large event\n Number of guest: "+guest+"\nThe price per guest is: "+lowerPricePerGuest+"\nTotal: "+cost+"\nContact Phone Number: "+getPhoneNumber());
        }else{
            System.out.println("\n\n"+getEventNumber()+"\nIts a small event\n Number of guest: "+guest+"\nThe price per guest is: "+higherPricePerGuest+"\nTotal: "+cost+"\nContact Phone Number: "+getPhoneNumber());
        }
        System.out.println();
        
        for(int i=0;i<guest;i++){
            System.out.println("Please come to my event!");
        }
    }

     public String getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(String eventNumber) {
        boolean check=true;
        for(int i=0;i<eventNumber.length();i++){
            if(i==0){
                if(!Character.isLetter(eventNumber.charAt(i))){
                    check=false;
                    break;
                }
            }else{
                if(!Character.isDigit(eventNumber.charAt(i))){
                    check=false;
                    break;
                }
            }
        }
        if(check && eventNumber.length()==4){
            eventNumber=Character.toUpperCase(eventNumber.charAt(0))+eventNumber.substring(1,4);
            this.eventNumber=eventNumber;
        }
    }
    
    public void setPhoneNumber(String phoneNumber){
        StringBuilder allDigitNumber =new StringBuilder();
        int cont=0;
        
        for(int i=0;i<phoneNumber.length();i++){
            if(Character.isDigit(phoneNumber.charAt(i))){
                allDigitNumber.append(phoneNumber.charAt(i));
                cont++;
            }
        }
        if(cont==10) 
            this.phoneNumber=allDigitNumber.toString();
    }
    
    public String getPhoneNumber(){
        StringBuilder numberFormat=new StringBuilder();
        
        for(int i=0;i<this.phoneNumber.length();i++){
            switch (i) {
                case 0:
                    numberFormat.append("(").append(this.phoneNumber.charAt(i));
                    break;
                case 2:
                    numberFormat.append(this.phoneNumber.charAt(i)).append(")");
                    break;
                case 3:
                    numberFormat.append(" ").append(this.phoneNumber.charAt(i));
                    break;
                case 5:
                    numberFormat.append(this.phoneNumber.charAt(i)).append("-");
                    break;
                default:
                    numberFormat.append(this.phoneNumber.charAt(i));
                    break;
            }
        }
        return numberFormat.toString();
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
    public void setEventType(Integer eventType) {
    	if(eventType>4) {
    		this.eventType = 4;
    	}else {
    		this.eventType = eventType;
    	}
    }
    public Integer getEventType() {
    	return eventType;
    }
    public String getEventTypeString() {
    	return EVENTTYPEARRAY[eventType];
    }

}
