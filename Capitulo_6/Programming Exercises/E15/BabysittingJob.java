
package createbabysittingjob;

public class BabysittingJob {
    private int idJob;
    private int idEmp;
    private int numBend;
    private int nH;
    private int total;
    private String nombre;

    public BabysittingJob(int idJob, int idEmp, int numBend, int nH){
        this.idJob = idJob;
        this.idEmp = idEmp;
        this.numBend = numBend;
        this.nH = nH;
        asignarNombre();
        calculaTotal();
    }


    private void asignarNombre(){
        switch (idEmp){
            case 1:
                nombre = "Cindy";
                break;
            case 2:
                nombre = "Greg";
                break;
            case 3:
                nombre = "Marcia";
                break;
        }
    }


    public static int nuevoidJob(int year, int jobNumber){
        return Integer.parseInt((year % 100) + "" + jobNumber);
    }


    private void calculaTotal(){
        int pago = 0;

        switch (idEmp){
            case 1:
                pago = 7 * numBend;
                break;
            case 2:
            case 3:
                for (int i = 0; i < numBend; ++i){
                    if (i == 0) {
                        pago = 9;
                    } else {
                        pago += 4;
                    }
                }
                break;
        }

        total = pago * nH;

    }

    public void resultados(){
        System.out.println("\n----------------------------------------");
        System.out.println("                Nota");
        System.out.println("========================================");
        System.out.println("Id trabajo:                " + idJob);
        System.out.println("Empleado:                  " + nombre);
        System.out.println("Id empleado:               " + idEmp);
        System.out.println("Num. ninios:               " + numBend);
        System.out.println("Horas:                     " + nH);
        System.out.println("========================================");
        System.out.println("Total:                   $" + total);
        System.out.println("----------------------------------------");
    }
}
