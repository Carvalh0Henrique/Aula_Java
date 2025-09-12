
package fatec.poo.model;

/**
 *
 * @author Henrique
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtadm, double vht) {
        super(r, n, dtadm); //chamada do método construtor da superclasse
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht) {
        qtdeHorTrab = qht;
    }
    
    //Aplicando o polimorfismo
    //Sobreposição (override) do método
    public double calcSalBruto() {
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao() {
        return(calcSalBruto() * 0.075);
    }
    
    @Override
    public double calcSalLiquido() {
        return(calcSalBruto() + calcGratificacao() - calcDesconto());
    }
}
