
package fatec.poo.model;

/**
 *
 * @author Henrique
 */
public class Palestrante extends Pessoa {
    private String empresa;
    private double taxaCobranca;
    private Palestra[] palestras;
    private int numFunc;

    public Palestrante(String empresa, String cpf, String nome) {
        super(cpf, nome);
        this.empresa = empresa;
        
        palestras = new Palestra[5];
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca;
    }
    
    public void addPalestra(Palestra p) {
        palestras[numFunc] = p;
        numFunc++;
    }
    
    public double calcTotalReceberPalestras() {
        double valorTotal = 0;
        
        for(int i = 0; i < numFunc; i++) {
            valorTotal += palestras[i].calcTotalFaturado() * (taxaCobranca / 100);
        }
        
        return(valorTotal);
    }
}
