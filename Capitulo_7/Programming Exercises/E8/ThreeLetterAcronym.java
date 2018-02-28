import javax.swing.JOptionPane;

public class ThreeLetterAcronym {

    public static void main(String[] args) {
        String words;
        StringBuilder acronimo=new StringBuilder();
        char c;
        
        words=JOptionPane.showInputDialog(null,"Ingresar 3 palabras para obtener acrónimo");
        for(int i=0;i<words.length();i++){
            c=words.charAt(i);
            if(i==0){
                c=Character.toUpperCase(c);
                acronimo.append(c);
            }else{
                if(words.charAt(i)==' '){
                    ++i;
                    c=words.charAt(i);
                    c=Character.toUpperCase(c);
                    acronimo.append(c);
                }
            }
        }
        acronimo.setLength(3);
        JOptionPane.showMessageDialog(null,"El acrónimo de "+words.toLowerCase()+" es "+acronimo);
    }     
}