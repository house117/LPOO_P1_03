package rental;

import java.util.Scanner;

public class Rental {
    
    public final static int minutesInHour =60;
    public final static int rentalRate = 40;
    private String contractNumber = "A000";
    private int minutes =0;
    private int price;
    private int m=0;
    
    
    public Rental(String contractNumber, int minutes) {
        this.contractNumber=contractNumber;
        this.minutes=minutes;
        //setContractNumber(contractNumber);
        //setMinutes(minutes);
    }
    
    
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getMinutes() {
        return minutes;
    }
    public int okMinutes(){
        boolean condi = false;
        Scanner sc = new Scanner(System.in);
         do{
            if(condi){
                System.out.println("Minutes >60 and <7200");
            }
             System.out.println("Minutes: ");
            m = sc.nextInt();
            condi = true;
            
        }while(m <60 || m > 7200);
         return m;
    }
   
    public void display(int minutes){
        
        
        int cost = setMinutes(minutes);
        if(cost==-1){
            System.out.println("Wait until the next hour");
        }else{
            System.out.println("You have:  "+ minutes+ "minutes \nNumber of hours: "+(minutes/minutesInHour)+"\nMinutes extras: "+(minutes%minutesInHour)+"\nPrice"+cost);
        }
        for(int i=0 ;i<(minutes/minutesInHour);i++){
            System.out.println("Coupon good for 10 percent off next rental!");
        }
        
        
    }
     public int setMinutes(int minutes) {
        this.minutes = minutes;
        int h = this.minutes/60;
        int em = this.minutes%60;
        if( em <= 40){
            price = (h*rentalRate)+(em*1);
        }else{
            price = -1;
        }
        return price;
        
    }
    //Default constructor
    Rental(){
        
    }
    
    
}
