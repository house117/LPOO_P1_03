import java.util.Scanner;

public class FiveLettersAndFiveDigits {

    public static void main(String[] args) {
        String statement;
        Character caracter;
        Scanner input=new Scanner(System.in);
        int contLetras,contDigitos;
        boolean check=false;
        
        do{
            System.out.print("Ingresar String>> ");
            statement=input.nextLine();
            contLetras=0;
            contDigitos=0;
            for(int i=0;i<statement.length();++i){
                caracter=statement.charAt(i);
                if(Character.isDigit(caracter))
                    ++contDigitos;
                else if(Character.isLetter(caracter))
                    ++contLetras;
            }
            if(contDigitos>=5 && contLetras>=5){
                System.out.println("String válido");
                check=true;
            }else if (contDigitos<5 && contLetras>=5)
                System.out.println("String inválido hacen falta "+(5-contDigitos)+" digítos");
            else if (contLetras<5 && contDigitos>=5)
                System.out.println("String inválido  hacen falta "+(5-contLetras)+" letras");
            else
                System.out.println("String inválido hacen falta "+(5-contDigitos)+" digítos y "+(5-contLetras)+" letras");
        }while(!check);
    }
    
}