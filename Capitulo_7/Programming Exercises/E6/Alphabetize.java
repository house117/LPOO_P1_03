import java.util.Scanner;

public class Alphabetize {

    public static void main(String[] args) {
        String cadena1, cadena2, cadena3;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Ingresa una cadena>> ");
        cadena1=input.nextLine();
        System.out.print("Ingresa una segunda cadena>> ");
        cadena2=input.nextLine();
        System.out.print("Ingresa una tercer cadena>> ");
        cadena3=input.nextLine();
        
        if(!verifyAlpha(cadena1,cadena2) || !verifyAlpha(cadena2, cadena3))
            System.out.println("No se ingresaron en orden alfabético");
        else
            System.out.println("Se ingresaron en orden alfabético");
    }
    public static boolean verifyAlpha(String a, String b){
	String aLower = a.toLowerCase();
     String bLower = b.toLowerCase();
        return a.compareTo(b)<=0; //true si primero es 'a' en orden alfabetico, false si es 'b'
    }
            
}