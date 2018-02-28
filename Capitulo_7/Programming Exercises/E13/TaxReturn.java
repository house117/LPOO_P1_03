
import javax.swing.JOptionPane;;

public class TaxReturn {
    private String socialNumber;
    private String firstName;
    private String lastName;
    private String streetAdd;
    private String city;
    private String state;
    private String zipCode;
    private Double annualIn;
    private Character maritalStatus;
    private Double taxL;
    
    public TaxReturn(String num,String firstName,String lastName,String address,String city,String state,String code,Double income,Character mStatus){
        this.socialNumber=num;
        this.firstName=firstName;
        this.lastName=lastName;
        this.streetAdd=address;
        this.city=city;
        this.state=state;
        this.zipCode=code;
        this.annualIn=income;
        this.maritalStatus=mStatus;
        this.taxL=income*calculateTaxLiability(income, mStatus);
        
    }
    
    private Double calculateTaxLiability(Double income, Character maritalStatus){
        Character.toUpperCase(maritalStatus);
        Double percent=0.0;
        switch(maritalStatus){
            case 'S':
                if(income<=20000)
                    percent=0.15;
                else if(income>=20001 && income<=50000){
                    percent=0.22;
                }else
                    percent=0.30;
                break;
            case 'C':
                if(income<=20000)
                    percent=0.14;
                else if(income>=20001 && income<=50000)
                    percent=0.20;
                else
                    percent=0.28;
                break; 
        }
        return percent;
    }
    
    public void displayInfo(){
        JOptionPane.showMessageDialog(null, "Datos de "+lastName+" "+firstName+
                "\nNumero Social: "+socialNumber+
                "\nCódigo Zip: "+zipCode+
                "\nEstado: "+state+
                "\nCiudad: "+city+
                "\nDirección: "+streetAdd+
                "\nEstado Civil: "+maritalStatus+
                "\nIngresos Anuales: "+annualIn+
                "\nImpuestos: "+taxL);
    }
    
}