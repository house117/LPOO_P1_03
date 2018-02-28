
package countbyfives;

public class CountByFives {

    
    public static void main(String[] args) {
        for(int i=0;i<=200;i=i+5){
            System.out.printf(" "+i);
            if(i%50==0){
                System.out.println();
            }
        }
    }
    
}
