
package scholarship2;

import java.util.Scanner;


public class Scholarship2 {

    public static void main(String[] args) {
        Double average;
        Integer actEx, servAct;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your high school grade point average:");
	average = in.nextDouble();
        System.out.println("Enter the number of extracurricular activities");
	actEx = in.nextInt();
        System.out.println("Enter the  number of service activities");
	servAct = in.nextInt();
        if((average>=3.8 && average <4.0)&&(actEx>=1)&&(servAct>=1)){
            System.out.println("ScholarShip Candidate");
        }else if((average>=3.4&&average<=3.8)&&(actEx>=3)&&(servAct>=3)){
            System.out.println("ScholarShip Candidate");
        }else if((average>=3.0&&average<=3.4)&&(actEx>=2)&&(servAct>=3)){
            System.out.println("ScholarShip Candidate");
        }else if(average<0 || average > 4.0){
            System.out.println("Your average is invalid");
        }else if (actEx<0 || servAct < 0){
             System.out.println("The number is invalid");
        }else{
            System.out.println("Not a Candidate");
        }
    }
    
}
