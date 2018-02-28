package knots;
public class Knots {
    public static void main(String[] args) {
        final double k = 1.852;
        final double m = 1.151;
        
        for(int i=15;i<=30;i++){
            System.out.println("Nudo: "+i);
            System.out.println("Km: "+(i*k));
            System.out.println("Milla N: "+(i*m));
            System.out.println();
        }
    }
    
}
