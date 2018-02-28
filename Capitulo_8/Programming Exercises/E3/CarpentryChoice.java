
package carpentrychoice;
import java.util.*;

public class CarpentryChoice {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        String mueble;
        int precio;
        String[] muebles = {"mesa", "escritorio", "tocador", "centro de entretenimiento"};
        for(int i = 0; i<4;i++){
            System.out.println(i+1+".-" +muebles[i]);
        }
        do{
            System.out.println("escoja una opcion y escriba el mueble que desea");
            mueble = datos.nextLine();
            switch(mueble){
            case "mesa":
            case "MESA":
                precio= 250;
                break;
            case "escritorio":
            case "ESCRITORIO":
                precio= 325;
                break;
            case "tocador":
            case "TOCADOR":
                precio= 420;
                break;
            case "centro de entretenimiento":
            case "CENTRO DE ENTRETENIMEINTO":
                precio= 600;
                break;
            default: 
                precio = 0;
                break;
            }

        } while(precio == 0);
        
        System.out.println("pagará: $"+precio);
    }    
}
