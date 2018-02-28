package demosalesperson;
public class DemoSalesperson {
    public static void main(String[] args) {
      Salesperson[] s = new Salesperson[10];
      
      for(int i=0;i<10;i++){
          s[i]=new Salesperson(9999, 0.0);
      }
      
      for(int i=0;i<10;i++){
        System.out.println("vendedor "+(i+1)+": "+s[i].getNoIdentificacion()+"      "+ s[i].getVentas());
    }
        // TODO code application logic here
    }
    
}
