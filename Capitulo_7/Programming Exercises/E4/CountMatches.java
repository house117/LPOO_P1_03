import java.util.Scanner;

public class CountMatches {

    public static void main(String[] args) {
        String cadenaPrim, cadenaSeg;
        Scanner input=new Scanner(System.in);
        StringBuilder encontrados=new StringBuilder();
        int cont=0;
        
        System.out.print("Ingresa una cadena>> ");
        cadenaPrim=input.nextLine();
        System.out.print("Ingresa otra cadena>> ");
        cadenaSeg=input.nextLine();
        
        for(int i=0;i<cadenaSeg.length();i++){
            for(int j=0;j<cadenaPrim.length();j++){
                if(cadenaPrim.charAt(j)== cadenaSeg.charAt(i)){
                    cont++;
                    encontrados.append(" ").append(cadenaPrim.charAt(j));
                }
            }
        }
        System.out.println(cont+" caracteres en "+cadenaPrim+" tambien se encuentran en "+cadenaSeg);
        System.out.println("Los "+cont+" caracteres son los siguientes:\n"+encontrados);
        
    }
    
}