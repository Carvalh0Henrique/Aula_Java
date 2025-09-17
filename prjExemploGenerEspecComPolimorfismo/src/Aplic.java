
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;


/**
 *
 * @author Henrique
 */
public class Aplic {

    public static void main(String[] args) {
        //DecimalFormat df = new DecimalFormat("#,##0.00"); -> Baseado no padrão da máquina
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //INSTACIA E PASSA VALORES A CLASSE FuncionarioHorista
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Gerente");
        
        //INSTACIA E PASSA VALORES A CLASSE FuncionarioMensalista
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Henrique", "06/05/2006", 1510.0);
        funcMen.setNumSalMin(3);
        funcMen.setCargo("Estagiário");
        
        //INSTACIA E PASSA VALORES A CLASSE FuncionarioComissionado
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Jorge", "08/12/2007", 10);
        funcCom.setSalBase(1200);
        funcCom.setCargo("Vendedor");
        funcCom.addVendas(12056.56);
        
        //IMPRIME OS VALORES DA CLASSE FuncionarioHorista
        System.out.println("HORISTA");
        System.out.println("Cargo: [" + funcHor.getCargo() + "]");
        System.out.println("Salario Bruto: [" + df.format(funcHor.calcSalBruto()) + "]");
        System.out.println("Desconto: [" + df.format(funcHor.calcDesconto()) + "]");
        System.out.println("Gratificação: [" + df.format(funcHor.calcGratificacao()) + "]");
        System.out.println("Salário Líquido: [" + df.format(funcHor.calcSalLiquido()) + "]");
        
        //IMPRIME OS VALORES DA CLASSE FuncionarioMensalista
        System.out.println("\nMENSALISTA");
        System.out.println("Cargo: [" + funcMen.getCargo() + "]");
        System.out.println("Salario Bruto: [" + df.format(funcMen.calcSalBruto()) + "]");
        System.out.println("Desconto: [" + df.format(funcMen.calcDesconto()) + "]");
        System.out.println("Salário Líquido: [" + df.format(funcMen.calcSalLiquido()) + "]");
        
        //IMPRIME OS VALORES DA CLASSE FuncionarioComissionado
        System.out.println("\nCOMISSIONADO");
        System.out.println("Cargo: [" + funcCom.getCargo() + "]");
        System.out.println("Salario Bruto: [" + df.format(funcCom.calcSalBruto()) + "]");
        System.out.println("Desconto: [" + df.format(funcCom.calcDesconto()) + "]");
        System.out.println("Gratificação: [" + df.format(funcCom.calcGratificacao()) + "]");
        System.out.println("Taxa Comissão: [" + df.format(funcCom.getTaxaComissao()) + "]");
        System.out.println("Total Vendas: [" + df.format(funcCom.getTotalVendas()) + "]");
        System.out.println("Salário Líquido: [" + df.format(funcCom.calcSalLiquido()) + "]");
    }
    
}
