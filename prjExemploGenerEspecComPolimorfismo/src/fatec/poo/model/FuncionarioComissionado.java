
package fatec.poo.model;

/**
 *
 * @author Henrique
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
   public FuncionarioComissionado(int r, String n, String dtadm, double tc) {
       super(r, n, dtadm);
       taxaComissao = tc;
   }
   
   public void setSalBase(double sb) {
       salBase = sb;
   }
   
   public double getSalBase() {
       return(salBase);
   }
   
   public double getTotalVendas() {
       return(totalVendas);
   }
   
   public double getTaxaComissao() {
       return(taxaComissao);
   }
   
   public void addVendas(double valorVenda) {
       totalVendas += valorVenda;
   }
   
   public double calcSalBruto() {
       return(salBase + (taxaComissao/100) * totalVendas);
   }
   
   public double calcGratificacao() {
       if(getTotalVendas() <= 5000) {
           return(0);
       } else if(getTotalVendas() <= 10000) {
           return(0.03 * calcSalBruto());
       } else {
           return(0.05 * calcSalBruto());
       }
   }
   
   public double calcSalLiquido() {
       return(super.calcSalLiquido() + calcGratificacao());
   }
}
