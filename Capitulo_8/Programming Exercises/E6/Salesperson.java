
package demosalesperson;

public class Salesperson {
    private Integer noidentificacion;
    private double ventas;
    
    public Salesperson(Integer noi, double ventas){
        this.noidentificacion = noi;
        this.ventas = ventas;
    }
    
    public void setNoIdentificacion(Integer noi){
        this.noidentificacion = noi;
    }
    
    public void setVentas(double ventas){
        this.ventas = ventas;
    }
    
    public Integer getNoIdentificacion(){
        return this.noidentificacion;
    }
    
    public double getVentas(){
        return this.ventas;
    }
}
