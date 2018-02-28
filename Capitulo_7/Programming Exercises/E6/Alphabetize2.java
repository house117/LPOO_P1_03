import java.util.Scanner;

public class Alphabetize2 {

    public static void main(String[] args) {
        String cadena1, cadena2, cadena3;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Ingresa una cadena>> ");
        cadena1=input.nextLine();
        System.out.print("Ingresa una segunda cadena>> ");
        cadena2=input.nextLine();
        System.out.print("Ingresa una tercer cadena>> ");
        cadena3=input.nextLine();
        
        System.out.println("Ordenadas Alfabéticamente");
        
        if(verifyAlpha(cadena1, cadena2)&&verifyAlpha(cadena1,cadena3)){
            if(verifyAlpha(cadena2,cadena3))
                System.out.println(cadena1+"\t"+cadena2+"\t"+cadena3);
            else
                System.out.println(cadena1+"\t"+cadena3+"\t"+cadena2);
        }else if(verifyAlpha(cadena2,cadena3)){
            if(verifyAlpha(cadena3, cadena1))
                System.out.println(cadena2+"\t"+cadena3+"\t"+cadena1);
            else
                System.out.println(cadena2+"\t"+cadena1+"\t"+cadena3);
        }else{
            if(verifyAlpha(cadena1,cadena2))
                System.out.println(cadena3+"\t"+cadena1+"\t"+cadena2);
            else
                System.out.println(cadena3+"\t"+cadena2+"\t"+cadena1);
        }
    }
    public static boolean verifyAlpha(String a, String b){
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        return aLower.compareTo(bLower)<=0; //true si es primero 'a' en orden alfabetico, false si lo es 'b'
    }
            
}