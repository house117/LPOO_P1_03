import javax.swing.JOptionPane;

public class PrepareTax {

    public static void main(String[] args) {
        String number, zip, city, nombre, apellido, state, address, statusMarital, incomeS;
        Character mStatus;
        Double income;
        boolean check=true;
        
        nombre = JOptionPane.showInputDialog(null, "Nombre", JOptionPane.INPUT_VALUE_PROPERTY);
        apellido = JOptionPane.showInputDialog(null, "Apellido", JOptionPane.INPUT_VALUE_PROPERTY);
        state = JOptionPane.showInputDialog(null, "Estado", JOptionPane.INPUT_VALUE_PROPERTY);
        city = JOptionPane.showInputDialog(null, "Ciudad", JOptionPane.INPUT_VALUE_PROPERTY);
        address = JOptionPane.showInputDialog(null, "Dirección", JOptionPane.INPUT_VALUE_PROPERTY);
        do{ 
            number = JOptionPane.showInputDialog(null, "Numero de Seguro Social", JOptionPane.INPUT_VALUE_PROPERTY);
            for(int i=0;i<number.length();i++){
                if(i!=3||i!=6)
                    check = !Character.isDigit(number.charAt(i));
                if(i==3 || i==6)
                    check = number.charAt(i)!='-';
            }
            if(11!=number.length()) 
                check=true;
            if(check)
                JOptionPane.showMessageDialog(null, "El numero de Seguro Social ingresado es incorrecto\nEl formato debe ser 999-99-9999");
        }while(check);
        
        check=true;
        do{
            zip = JOptionPane.showInputDialog(null, "Codigo Zip", JOptionPane.INPUT_VALUE_PROPERTY);
            for(int i=0;i<zip.length();i++){
                if(zip.length()!=5)
                    break;
                check= !Character.isDigit(zip.charAt(i));
                if(check)
                    break;
            }
            if(check)
                JOptionPane.showMessageDialog(null, "El Codigo Zip debe ser de 5 Digitos");
        }while(check);
        
        do{
            statusMarital=JOptionPane.showInputDialog(null, "Estado Civil", JOptionPane.INPUT_VALUE_PROPERTY);
            mStatus=statusMarital.charAt(0);
            check= mStatus == 'S'|| mStatus == 's' || mStatus == 'C' || mStatus == 'c';
            if(!check)
                 JOptionPane.showMessageDialog(null, "Los valores correctos para estado civil son\n"
                         + "- 'S' o 's' (Indica Soltero)\n- 'C' o 'c' (Indica Casado)");
        }while(!check);
        
        do{
            incomeS=JOptionPane.showInputDialog(null, "Ingresos Anuales", JOptionPane.INPUT_VALUE_PROPERTY);
            income=Double.parseDouble(incomeS);
            if(income>0.0)
                break;
            else{
                JOptionPane.showMessageDialog(null, "No se aceptan Ingresos negativos");
                check=true;
            }
        }while(check);
        
        TaxReturn prueba=new TaxReturn(number,nombre,apellido,address,city,state,zip,income,mStatus);
        prueba.displayInfo();
    }
}