
package testdigitalcamera;

import java.util.Scanner;

public class TestDigitalCamera {

    public static void main(String[] args) {
        String brand, brand2, brand3, brand4;
        Integer mxpixeles, mxpixeles2, mxpixeles3, mxpixeles4;        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the brand:");
	brand = in.next();
        System.out.println("Enter the megapixeles");
        mxpixeles = in.nextInt();
        DigitalCamera array[] = new DigitalCamera[4];
        DigitalCamera array[0] = new DigitalCamera(brand, mxpixeles);
        object1.Details();
        System.out.println();
        
        System.out.println("Enter the brand:");
	brand2 = in.next();
        System.out.println("Enter the megapixeles");
        mxpixeles2 = in.nextInt();
        
        DigitalCamera array[1] = new DigitalCamera(brand2, mxpixeles2);
        object2.Details();
        System.out.println();
        
        System.out.println("Enter the brand:");
	brand3 = in.next();
        System.out.println("Enter the megapixeles");
        mxpixeles3 = in.nextInt();
        
        DigitalCamera array[2] = new DigitalCamera(brand3, mxpixeles3);
        object3.Details();
        System.out.println();
        
        
        System.out.println("Enter the brand:");
	brand4 = in.next();
        System.out.println("Enter the megapixeles");
        mxpixeles4 = in.nextInt();
        
        DigitalCamera array[3] = new DigitalCamera(brand4, mxpixeles4);
        object4.Details();
        System.out.println();
    }
    
}
