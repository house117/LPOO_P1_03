
package invoice;

public class TestInvoice2 {
    public static void main(String[] args){
        Invoice2 prueba1 = new Invoice2(10, 345.67, 31, 2, 1034);
        prueba1.display();
        Invoice2 prueba2 = new Invoice2(10000, 456.45, 30, 12, 1034);
        prueba2.display();
        Invoice2 prueba3 = new Invoice2(10000, 64.45, 30, 56, 1034);
        prueba3.display();
    }
}
