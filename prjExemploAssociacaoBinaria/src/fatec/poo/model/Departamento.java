
package fatec.poo.model;

/**
 *
 * @author Henrique 
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios[]; //Multiplicidade 1..*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5]; //Matriz de objetos
        numFunc = 0; //indica a posição do primeiro elemento da matriz
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    //Tem como parâmetro de entrada um objeto da classe FuncionarioHorista ou um
    //objeto da classe FuncionarioMensalista ou um objeto da classe FuncionarioComissionado
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios() {
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de funcionários: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for(int cont = 0; cont < numFunc; cont++) {
            System.out.print(funcionarios[cont].getRegistro() + "\t\t");
            System.out.print(funcionarios[cont].getNome() + "\t\t");
            System.out.println(funcionarios[cont].getCargo());
        }
    }
}
