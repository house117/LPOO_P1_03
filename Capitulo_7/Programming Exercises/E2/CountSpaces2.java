import java.util.Scanner;

public class CountSpaces2 {

    public static void main(String[] args) {
        String statement;
        Scanner input=new Scanner(System.in);
        int cont=0;
        
        System.out.print("Ingresar String>> ");
        statement=input.nextLine();
        for(int i=0;i<statement.length();++i){
            if(statement.charAt(i)==' ')
                ++cont;
        }
        System.out.println("Espacios encontrados en la frase:\n"+statement+"\nEspacios>> "+cont);
    }
    
}