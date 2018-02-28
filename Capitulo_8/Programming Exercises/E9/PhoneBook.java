
package phonebook;

import java.util.Scanner;

public class PhoneBook {
    private String nombre;
    private String numero;
    
    public PhoneBook(String nombre, String numero){
        this.nombre=nombre;
        this.numero=numero;
    }
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
    
    public static void main(String[] args) {
        arreglo a = new arreglo();
        a.addLista();
        a.buscar();
        // TODO code application logic here
        
        
    }
    
}

class arreglo{
    Scanner datos =  new Scanner(System.in);
    PhoneBook[] lista1 = new PhoneBook[20];
    int i=0;
    public void addLista(){  
        String nombre, numero;
        while(i<20){
            System.out.println("nombre: ");
            nombre = datos.nextLine();
            if(nombre.equals("zzz")){
                i=20;
            }
            else{
                System.out.println("Nunero: ");
                numero = datos.nextLine();
                setLista(nombre,numero,i);
                i++;
            }
        }
    }
    
    public void setLista(String nombre, String numero, Integer i){
        lista1[i] = new PhoneBook(nombre, numero);
    }
    
    public void buscar(){
        System.out.println("nombre a buscar: ");
        String nom = datos.nextLine();
        int j=0;
        while(j!=i){
            if((lista1[j].getNombre()).equals(nom)){
                System.out.println("numero: "+ lista1[j].getNumero());
                j=i;
            }
            else{
                j++;
                if(j==i){
                    System.out.println("no encontrado");
                }
            }
        }
    }
    
}
