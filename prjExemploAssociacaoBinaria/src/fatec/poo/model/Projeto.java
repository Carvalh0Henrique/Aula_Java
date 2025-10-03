
package fatec.poo.model;

/**
 *
 * @author Henrique
 */

public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario funcionarios[];
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        
        funcionarios = new Funcionario[5];
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }
        
    public void listarFuncionario() {
        
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Início: " + dtInicio);
        System.out.println("Data de término: " + dtTermino);
        System.out.println("Qtd. de funcionários: " + numFunc);
        System.out.println("Registro\t\tNome\t\tCargo\t\tDepartamento");
        
        for(int cont = 0; cont < numFunc; cont++) {
            System.out.print(funcionarios[cont].getRegistro() + "\t\t");
            System.out.print(funcionarios[cont].getNome() + "\t\t");
            System.out.print(funcionarios[cont].getCargo() + "\t\t");
            System.out.println(funcionarios[cont].getDepartamento().getNome());
        }
    }
}
