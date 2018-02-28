
package createpurchase;
public class Purchase {
    int numFact;
    double mVenta;
    double impuesto;
    
    public void setNumFact(int fact){
        numFact = fact;
    }
   
    public void setMontoVenta(double venta){
        mVenta = venta;
        impuesto = venta * 0.05;
    }
   
    public void resultados(){
        System.out.println("\n\nNum. de factura " + numFact);
        System.out.println("Monto de venta es: $" + mVenta);
        System.out.println("Los impuestos de venta son $" + impuesto);
        System.out.println("Las ganancias son $" + (mVenta +impuesto));
    }
}
