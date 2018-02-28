package temperatures;


import java.util.Scanner;
public class Temperatures {

    public static void main(String[] args) {
        Integer temperatureH, temperatureL;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hight temperature °C: ");
	temperatureH = in.nextInt();
        System.out.println("Enter the low temperature °C: ");
	temperatureL = in.nextInt();
        if(temperatureH>=90){
            System.out.println("Heat warning");
        }
        if(temperatureL<32){
             System.out.println("Freeze warning");
        }
        if((temperatureH-temperatureL)>40){
             System.out.println("Large temperature swing.");
        }
    }
    
}
