public class DemonstratingStringMethods {

    public static void main(String[] args) {
        String statement="\"You can never cross the ocean until you have the courage to lose sigth of the shore.\" - Chistopher Columbus";
        
        System.out.println("Resultados de aplicar los metodos al String: \n"+statement+"\n");
        System.out.println("indexOf('v') > "+statement.indexOf('v'));
        System.out.println("indexOf('x') > "+statement.indexOf('x'));
        System.out.println("charAt(16) > "+statement.charAt(16));
        System.out.println("endsWith(\"bus\") > "+statement.endsWith("bus"));
        System.out.println("endsWith(\"car\") > "+statement.endsWith("car"));
        System.out.println("replace ('c', 'C') > "+statement.replace('c', 'C'));
    }     
}