
package invoice;

public class Invoice2 {
     private Integer InvoiceNumber;
    private double BalanceDue;
    private Integer day;
    private Integer month;
    private Integer year;

    public Invoice2(Integer InvoiceNumber, double BalanceDue, Integer day, Integer month, Integer year) {
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
        if((day<1 || day>31)&&(month<1 || month>12)){
            this.day = 0;
        }else if(day>diasmes()){
            this.day = diasmes();
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
    private int diasmes(){
        switch(this.month){
        case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
            return 31;
	case 4:
	case 6:
        case 9:
        case 11:
            return 30;
        case 2:
            return 28; 
        }
         return 0;
    }
    public void display(){
        System.out.println("Invoice Number: "+this.InvoiceNumber+"\nBalance Due: "+this.BalanceDue+"\nYear: "+this.year+"\nDay: "+this.day+"\nMonth: "+this.month);
    }
}
