
package factorials;

public class Factorials {

    public static void main(String[] args) {
     
        int a=1,a1=1,a2=1,a3=1,a4=1,a5=1,a6=1,a7=1,a8=1,a9=1;
        for(int i=1;i<=10;i++){
            switch(i){
                case 1:
                    a*=i;
                case 2:
                    a1*=i;
                case 3:
                    a2*=i;
                case 4:
                    a3*=i;
                case 5:
                    a4*=i;
                case 6:
                    a5*=i;
                case 7:
                    a6*=i;
                case 8:
                    a7*=i;
                case 9:
                    a8*=i;
                case 10:
                    a9*=i;
            }
        }
        System.out.println("Factorial 1: "+a+"\nFactorial 2: "+a1+"\nFactorial 3: "+a2+"\nFactorial 4: "
                +a3+"\nFactorial 5: "+a4+"\nFactorial 6: "+a5+"\nFactorial 7: "+a6+"\nFactorial 8: "+a7
                +"\nFactorial 9: "+a8+"\nFactorial 10: "+a9);
    }
    
}
