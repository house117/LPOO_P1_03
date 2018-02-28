import java.util.Scanner;

public class BabyNameComparison {

    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        Scanner input=new Scanner(System.in);
        
        
        System.out.print("Baby Name 1>> ");
        nombre1=input.nextLine();
        System.out.print("Baby Name 2>> ");
        nombre2=input.nextLine();
        System.out.print("Baby Name 3>> ");
        nombre3=input.nextLine();
        
        System.out.println("Los nombres del bebé pueden ser:");
        System.out.println(imprimir(nombre1,nombre2));
        System.out.println(imprimir(nombre1,nombre3));
        System.out.println(imprimir(nombre2,nombre1));
        System.out.println(imprimir(nombre2,nombre3));
        System.out.println(imprimir(nombre3,nombre1));
        System.out.println(imprimir(nombre3,nombre2));
    }
    
    public static String imprimir(String name, String name2){
        return name+" "+name2;
    }
    
}