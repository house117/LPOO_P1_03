
package numberlistdemo;

public class NumberListDemo {
    private int[] numeros = new int[8];
    
    public void setNumeros(Integer n1,Integer n2, Integer n3, Integer n4, Integer n5,Integer n6, Integer n7, Integer n8){
        this.numeros[0]=n1;
        this.numeros[1]=n2;
        this.numeros[2]=n3;
        this.numeros[3]=n4;
        this.numeros[4]=n5;
        this.numeros[5]=n6;
        this.numeros[6]=n7;
        this.numeros[7]=n8;
    }
    
    public int getNumeros(int i){
            return numeros[i];
    }
    
    public int suma(){
        Integer suma=0;
        for(int i = 0; i<8;i++){
            suma = suma+numeros[i];
        }
        return suma;
    }
    
    public void menores5(){
        for(int i=0;i<8;i++){
            if(numeros[i]<5){
                System.out.println(numeros[i]);
            }
        }
    }
    
    public void menor(){
        int menor = numeros[1];
        for(int i=0;i<8;i++){
            if(menor>numeros[i]){
                menor = numeros[i];
            }
        }
        System.out.println(menor);
    }
    
    public void mayor(){
        int mayor = numeros[1];
        for(int i=0;i<8;i++){
            if(mayor<numeros[i]){
                mayor = numeros[i];
            }
        }
        System.out.println(mayor);
    }
    
    public double promedio(){
        return (suma())/8.0;
    }
    
    public void mayorepromedio(){
        for(int i=0;i<8;i++){
            if(numeros[i]>promedio()){
                System.out.println(numeros[i]);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        NumberListDemo n = new NumberListDemo();
        n.setNumeros(1,-3,6,1,5,15,34,15);
        System.out.println("arreglo de abajo a arriba: ");
        for(int i=0;i<8;i++){
            System.out.println(n.getNumeros(i));
        }
        System.out.println("arreglo de arriba a abajo: ");
        for(int i=7;i>=0;i--){
            System.out.println(n.getNumeros(i));
        }
        System.out.println("suma: "+n.suma());
        System.out.println("menores a 5: "); n.menores5();
        System.out.println("numero mas pequeño: ");n.menor();
        System.out.println("numero mas grande: ");n.mayor();
        System.out.println("promedio: "+ n.promedio());
        System.out.println("numeros mayores al promedio: ");n.mayorepromedio();
    }
    
}
