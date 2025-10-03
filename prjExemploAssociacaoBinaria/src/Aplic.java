
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Departamento;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        
        Departamento dep1 = new Departamento("CP", "Compras");
        Departamento dep2 = new Departamento("RH", "Recursos Humanos");
        
        //INSTANCIA O PROJETO E ATRIBUI VALORES CONSTANTES
        Projeto proj = new Projeto(4040, "Projeto de POO");
        proj.setDtInicio("01/01/2025");
        proj.setDtTermino("31/12/2025");
        //SETTA O PROJETO PARA CADA TIPO DE FUNC
        funcHor.setProjeto(proj);
        funcMen.setProjeto(proj);
        funcCom.setProjeto(proj);
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux. Administrativo");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionario horista " + funcHor.getNome() + " trabalha no departamento de " + 
                                                                    funcHor.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionario mensalista " + funcMen.getNome() + " trabalha no departamento de " +
                                                                    funcMen.getDepartamento().getNome());
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionario Comissionado " + funcCom.getNome() + " trabalha no departamento de " + 
                                                                    funcCom.getDepartamento().getNome());
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        dep1.listarFuncionarios();
        
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        dep2.addFuncionario(funcCom);
        dep2.listarFuncionarios();
        
        proj.addFuncionario(funcHor);
        proj.addFuncionario(funcMen);
        proj.addFuncionario(funcCom);
        proj.listarFuncionario();
    }    
}
