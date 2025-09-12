
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;


/**
 *
 * @author Henrique
 */
public class Aplic {

    public static void main(String[] args) {
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Gerente");
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Henrique", "06/05/2006", 1510.0);
        funcMen.setNumSalMin(3);
        funcMen.setCargo("Estagiário");
        
        System.out.println("HORÁRIO");
        System.out.println("Cargo: [" + funcHor.getCargo() + "]");
        System.out.println("Salario Bruto: [" + funcHor.calcSalBruto() + "]");
        System.out.println("Desconto: [" + funcHor.calcDesconto() + "]");
        System.out.println("Gratificação: [" + funcHor.calcGratificacao() + "]");
        System.out.println("Salário Líquido: [" + funcHor.calcSalLiquido() + "]");
        
        System.out.println("\nMENSALISTA");
        System.out.println("Cargo: [" + funcMen.getCargo() + "]");
        System.out.println("Salario Bruto: [" + funcMen.calcSalBruto() + "]");
        System.out.println("Desconto: [" + funcMen.calcDesconto() + "]");
        System.out.println("Salário Líquido: [" + funcMen.calcSalLiquido() + "]");
    }
    
}
