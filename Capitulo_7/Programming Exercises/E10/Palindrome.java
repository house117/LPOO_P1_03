import javax.swing.JOptionPane;

public class Palindrome {

    public static void main(String[] args) {
        String entry;
        StringBuilder palindromo=new StringBuilder();
        StringBuilder palindromoCopy=new StringBuilder();
        
        entry=JOptionPane.showInputDialog(null,"Ingresar palindromo");
        
            for(int i=0;i<entry.length();i++){
                if(Character.isLetterOrDigit(entry.charAt(i)))
                    palindromo.append(entry.charAt(i));
            }
            for(int i=entry.length()-1;i>=0;i--){
                if(Character.isLetterOrDigit(entry.charAt(i)))
                    palindromoCopy.append(entry.charAt(i));
            }
        
        String  pal= palindromo.toString();
        String  palC= palindromoCopy.toString();
        
            if(!pal.equalsIgnoreCase(palC))
                JOptionPane.showMessageDialog(null,"NO es un Palindromo");
            else
                JOptionPane.showMessageDialog(null,"SI es un Palindromo");
    }     
}