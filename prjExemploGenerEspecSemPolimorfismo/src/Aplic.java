
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

/**
 *
 * @author Henrique
 */
public class Aplic {

    public static void main(String[] args) {
        Aluno objAluno = new Aluno(1010, "Henrique", "06/05/2006");
        Professor objProf = new Professor(333, "Dimas", "15/03/1978");
        objAluno.setMensalidade(1500);
        objProf.setSalario(15200.53);
        
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data de nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + objAluno.getMensalidade());
        System.out.println("----------------------------------------------------");
        System.out.println("Registro Funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de nascimento: " + objProf.getDataNascimento());
        System.out.println("Salario: " + objProf.getSalario());
    }
    
}
