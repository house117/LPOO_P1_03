public class CountSpaces {

    public static void main(String[] args) {
        String statement="The person who says something is imposible should not interrupt the person who is doing it";
        int cont=0;
        
        for(int i=0;i<statement.length();++i){
            if(statement.charAt(i)==' ')
                ++cont;
        }
        System.out.println("Espacios encontrados en la frase:\n"+statement+"\nEspacios>> "+cont);
    }
    
}