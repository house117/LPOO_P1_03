
package testpark;

import java.util.Scanner;


public class TestPark {

    
    public static void main(String[] args) {
        String namePark, namePark2;
        boolean picfac, tenis;
        int size, size2;
        
        Scanner in = new Scanner(System.in);   
        
        System.out.println("\n\nOBJECT 1\n\n");
        System.out.println("Enter the name of the park: ");
	namePark = in.nextLine();
        System.out.println("Enter the size of the park: ");
	size = in.nextInt();
        in.nextLine();
        Park object1 = new Park(namePark, size, true, true, true, true);
        boolean rmetodo1 = metodo1(object1.getPicnicFacilities(), object1.getPlayground()); 
        if(object1.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }
        System.out.println("Name of the park: "+object1.getName()+"\nSize: "+object1.getSize()+"\nResult of the metodo1: "+ rmetodo1);
        
        
        
        System.out.println("\n\nOBJECT 2\n\n");
        System.out.println("Enter the name of the park: ");
	namePark2 = in.nextLine();   
        in.nextLine();
        System.out.println("Enter the size of the park: ");
	size2 = in.nextInt();        
        Park object2 = new Park(namePark2, size2, true, true, false, true);
        boolean rmetodo2 = metodo2(object2.getPicnicFacilities(), object2.getPlayground(), object2.getTennisCourt(), object2.getSwimmingPool());        
        if(object2.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }
        System.out.println("Name of the park: "+object2.getName()+"\nSize: "+object2.getSize()+"\nResult of the metodo2: "+ rmetodo2);
   
    
        System.out.println("\n\nOBJECT 3\n\n");
        System.out.println("Enter the name of the park: ");
	String namePark3 = in.nextLine();   
        in.nextLine();
        System.out.println("Enter the size of the park: ");
	int size3 = in.nextInt();        
        Park object3 = new Park(namePark3, size3, true, true, false, true);
        int rmetodo3 = metodo3(object3.getPicnicFacilities(), object3.getPlayground(), object3.getTennisCourt(), object3.getSwimmingPool());        
        if(object3.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }
        System.out.println("Name of the park: "+object3.getName()+"\nSize: "+object3.getSize()+"\nResult of the metodo3: "+ rmetodo3);
   
        
        
        
        System.out.println("\n\nOBJECT 4\n\n");
        System.out.println("Enter the name of the park: ");
	String namePark4 = in.nextLine();   
        in.nextLine();
        System.out.println("Enter the size of the park: ");
	int size4 = in.nextInt();        
        Park object4 = new Park(namePark4, size4, true, false, false, true);
        metodo4(object4.getName(), object4.getSize());        
        if(object4.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }
        
   
    }
    
    
    
    public static boolean metodo1(boolean PicFac, boolean PlayG){
        if((PicFac==true)&&(PlayG==true)){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static boolean metodo2(boolean PicFac, boolean PlayG, boolean TenisC, boolean SwimP){
        if(PicFac==true && PlayG==true && TenisC==true && SwimP==true){
            return true;
        }else{
            return false;
        }
    }
    public static int metodo3(boolean PicFac, boolean PlayG, boolean TenisC, boolean SwimP){
        int cont=0;
        if(PicFac==true){
            cont++;
        }
        if(PlayG==true){
            cont++;
        }
        if (  TenisC==true ){
            cont++;
        }
        if (SwimP==true){
            cont++;
        }
        return cont;
    }
    
    public static void metodo4(String name, int size){
        System.out.println("Name of the park: "+name+"\nSize: "+size);
    }
}
