import javax.swing.JOptionPane;

public class Password {


    public static void main(String[] args) {
        String password,passwordAgain;
        int contLet=0, contDig=0, check;
        
        do{
            password=JOptionPane.showInputDialog(null,"Contraseña");
            for(int i=0;i<password.length();i++){
                if(Character.isDigit(password.charAt(i)))
                    contDig++;
                if(Character.isLetter(password.charAt(i)))
                    contLet++;
            }
            if(contDig>0&&contLet>0&&password.length()<=10&&password.length()>=6)
                break;
            else
                check=JOptionPane.showConfirmDialog(null,
                        "La contraseña debe tener al menos\n-1 dígito\n-1 letra\n-6 caracteres\n-NO mayor a 10 caracteres","Error",
                        JOptionPane.WARNING_MESSAGE);
        }while(check==0);
        do{
            passwordAgain=JOptionPane.showInputDialog(null,"Confirmar contraseña");
            if(password.equals(passwordAgain)){
                JOptionPane.showMessageDialog(null,"Felicidades, la contraseña coincide");
                break;
            }
            else
                check=JOptionPane.showConfirmDialog(null,
                        "La contraseña no coincide","Error",
                        JOptionPane.WARNING_MESSAGE);
        }while(check==0);
    }     
}