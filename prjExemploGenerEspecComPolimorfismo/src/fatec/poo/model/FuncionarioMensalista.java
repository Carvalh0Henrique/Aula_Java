
package fatec.poo.model;

/**
 *
 * @author Henrique
 */
public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dtadm, double valS) {
        super(r, n, dtadm);
        valSalMin = valS;
    }
    
    public void setNumSalMin(double numS) {
        numSalMin = numS;
    }
    
    public double calcSalBruto() {
        return(valSalMin * numSalMin);
    }
}
