//Este codigo tiene detalles, siento mucho no poder hacer que sirva al millon, no supe como resolverlo completamente
//Una disculpa amiguitos

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String cadena;
        int cont=0;
        
        System.out.print("Ingresar String >> ");
        cadena=entrada.nextLine();
        cadena=cleanWord(cadena);
        
        for(int i=0;i<cadena.length();i++){
            if(Character.isWhitespace(cadena.charAt(i)))
                 cont++;
        }
        System.out.println("Palabras encontradas >> "+(cont+1));
        
    }
    private static String cleanWord(String word) {

		word = word.replace(",", ""); // ,
		word = word.replace(".", ""); // .
		word = word.replace(":", ""); // :
		word = word.replace("(", ""); // (
		word = word.replace(")", ""); // )
		word = word.replace("[", ""); // [
		word = word.replace("]", ""); // ]
		word = word.replace("-", ""); // -

		return word;
    }
}