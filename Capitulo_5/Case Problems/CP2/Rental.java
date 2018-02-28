/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

/**
 *
 * @author bautista
 */
public class Rental {
    
    public final static int minutesInHour =60;
    public final static int rentalRate = 40;
    private String contractNumber = "A000";
    private int minutes =0;
    private int price;
    
    
    public Rental(String contractNumber, int minutes) {
        this.contractNumber=contractNumber;
        this.minutes=minutes;
        setContractNumber(contractNumber);
        setMinutes(minutes);
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

   
    public void display(int minutes){
        
        
        int cost = setMinutes(minutes);
        if(cost==-1){
            System.out.println("Wait until the next hour");
        }else{
            System.out.println("You have:  "+ minutes+ "minutes \nNumber of hours: "+(minutes/minutesInHour)+"\nMinutes extras: "+(minutes%minutesInHour)+"\nPrice"+cost);
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
