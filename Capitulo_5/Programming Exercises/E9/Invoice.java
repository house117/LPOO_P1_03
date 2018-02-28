
package invoice;

public class Invoice {
    private Integer InvoiceNumber;
    private double BalanceDue;
    private Integer day;
    private Integer month;
    private Integer year;

    public Invoice(Integer InvoiceNumber, double BalanceDue, Integer day, Integer month, Integer year) {
        if(InvoiceNumber<1000){
            this.InvoiceNumber = 0;
        }else{
            this.InvoiceNumber = InvoiceNumber;
        }
        if(month<1 || month>12){
            this.month = 0;
        }else{
            this.month = month;
        }
        if(day<1 || day>31){
            this.day = 0;
        }else{
            this.day = day;
        }
        if(year<2011 || year>2017){
            this.year = 0;
        }else{
            this.year = year;
        }
        this.BalanceDue = BalanceDue;
        
        
        
    }
    public void display(){
        System.out.println("Invoice Number: "+this.InvoiceNumber+"\nBalance Due: "+this.BalanceDue+"\nYear: "+this.year+"\nDay: "+this.day+"\nMonth: "+this.month);
    }
    
}
