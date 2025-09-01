/**
 *
 * @author Henrique
 */

import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int medIdentificacao, opcao, qtdDia;
        double medValMultaDiaria;
        String medTitulo;
        boolean medSituacao;
        
        System.out.print("Digite a identificação do livro: ");
        medIdentificacao = entrada.nextInt();
        
        System.out.print("Digite o título do livro: ");
        medTitulo = entrada.next();
        
        Livro objLiv = new Livro(medIdentificacao, medTitulo);
        
        System.out.print("Digite o valor da multa diária: R$ ");
        medValMultaDiaria = entrada.nextDouble();
        objLiv.setValMultaDiaria(medValMultaDiaria);
        
        do {
            System.out.println("\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("\n\n\tDigite a opção aqui: ");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1: 
                    System.out.println("\nIdentificação: [" + objLiv.getIdentificacao() + "]");
                    System.out.println("Título: [" + objLiv.getTitulo()+ "]");
                    if(objLiv.getSituacao()) {
                        System.out.println("Situação: [Emprestado]");
                    } else {
                        System.out.println("Situação: [Disponível]");
                    }
                    break;
                
                case 2:
                    if(objLiv.getSituacao()) {
                        System.out.println("\nO livro está emprestado.");
                    } else {
                        System.out.println("\nOperação de emprestimo realizada com sucesso.");
                        objLiv.emprestar();
                    }
                    break;
                
                case 3:
                    if(!objLiv.getSituacao()) {
                        System.out.println("\nO livro já está disponível.");
                    } else {
                        System.out.print("\nQuantos dias de atraso: ");
                        qtdDia = entrada.nextInt();
                        
                        System.out.println("\nValor da multa: [R$ " + objLiv.devolver(qtdDia) + "]");
                        System.out.println("Operação de devolução realizada com sucesso.");
                    }
                    break;
                 
                case 4: 
                    System.out.println("Sistema finalizado.");
                    break;
                    
                default:
                    System.out.println("Digite novamente.");
                    break;
        }
        }while(opcao != 4);
    }
    
}
