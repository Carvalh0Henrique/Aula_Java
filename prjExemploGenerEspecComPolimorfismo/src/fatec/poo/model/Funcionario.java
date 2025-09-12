
package fatec.poo.model;

/**
 *
 * @author Henrique
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;            //Atributo cargo para ambos os métodos, Mensalista e Horista
    
    public Funcionario(int r, String n, String dtadm) {
        registro = r;
        nome = n;
        dtAdmissao = dtadm;                
    }
    
    public void setCargo(String c) {
        cargo = c;
    }
    
    public int getRegistro() {
        return(registro);
    }
    
    public String getNome() {
        return(nome);
    }
    
    public String getDtAdmissao() {
        return(dtAdmissao);
    }
    
    public String getCargo() {
        return(cargo);
    }
    
    //Método abstrato, que possue apenas sua assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto() {
        return(0.10 * calcSalBruto());        
    }
    
    public double calcSalLiquido() {
        return(calcSalBruto() - calcDesconto());
    }
}