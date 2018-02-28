package phonenumbers;

import java.util.Scanner;
public class PhoneNumbers {
    private String nombre;
    private String numero;

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public PhoneNumbers(String nombre, String numero ) {
        this.nombre = nombre;
        this.numero = numero;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        directorio d = new directorio();
        d.add("armando", "9512223162");
        d.add("Glenn", "9512364852");
        d.add("jose luis", "9512458695");
        d.add("darwin", "9512451236");
        d.add("rafael", "9518465484");
        d.add("karen", "9516548451");
        d.add("david", "9516589445");
        d.add("evelin", "9512453215");
        d.add("esmeralda", "9512801112");
        d.add("karime", "9512587663");
        int i=0;
        while(i<30){
            System.out.println("contacto nuevo\n nombre: ");
            String nom = datos.nextLine();
            if(d.buscar(nom)!=1){
                System.out.println("numero: ");
                String num = datos.nextLine();
                d.add(nom, num);
                i++;
            }
        }
        
        
        // TODO code application logic here
    }
    
}
class directorio{
    int i1=0;
    PhoneNumbers[] p = new PhoneNumbers[30];
    
    public void add(String nom, String num){
            p[i1]=new PhoneNumbers(nom,num);
            i1++;
    }
    
    public int buscar(String nom){
        int apu=0;
        for(int i=0; i<i1;i++){
            if(p[apu].getNombre().equals(nom)){
                System.out.println("numero: "+p[apu].getNumero());
                return 1;
                
            }
            else{
                apu++;
            }
        }
        System.out.println("no encontrado");
        return 0;
    }
}
