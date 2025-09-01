
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Aplic {

    public static void main(String[] args) {
        int medRA, opcao;
        double medPrv1, medPrv2, medTrab1, medTrab2;
        String situacao;
        
        //OBJETOS INSTANCIADOS
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        //PRIMEIRA ENTRADA DE DADOS
        System.out.print("Digite seu RA: ");
        medRA = entrada.nextInt();
        
        System.out.print("Digite a nota da prova 1: ");
        medPrv1 = entrada.nextDouble();
        
        System.out.print("Digite a nota da prova 2: ");
        medPrv2 = entrada.nextDouble();
        
        System.out.print("Digite a nota do trabalho 1: ");
        medTrab1 = entrada.nextDouble();
        
        System.out.print("Digite a nota do trabalho 2: ");
        medTrab2 = entrada.nextDouble();
        
        //METODOS SETTER ALIMENTADOS
        objAluno.SetRA(medRA);
        objAluno.setNtPrv1(medPrv1);
        objAluno.setNtPrv2(medPrv2);
        objAluno.setNtTrab1(medTrab1);
        objAluno.setNtTrab2(medTrab2);
        
        //MENU
        do {
            System.out.println("\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Encerrar");
            System.out.print("\n\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if(opcao == 1) {
                System.out.println("\nRA: [" + objAluno.getRA() + "]");
                System.out.println("Prova 1: [" + objAluno.getNtPrv1() + "] Prova 2: [" + objAluno.getNtPrv2() + "]");
                System.out.println("Trabalho 1: [" + objAluno.getNtTrab1() + "] Trabalho 2: [" + objAluno.getNtTrab2() + "]");
            } else if(opcao == 2) {
                System.out.println("\nRA: [" + objAluno.getRA() + "]");
                System.out.println("Sua média das Provas é: [" + objAluno.calcMediaProva() + "]");
                System.out.println("Sua média dos Trabalhos é: [" + objAluno.calcMediaTrab() + "]");
            } else if(opcao == 3) {
                System.out.println("\nRA: [" + objAluno.getRA() + "]");
                System.out.println("Sua média final é: [" + objAluno.calcMediaFinal() + "]");
                
                if(objAluno.isAprovado()) {
                    System.out.println("Situação Aprovado!");
                } else {
                    System.out.println("Situação Reprovado!");
                }
                
            } else if(opcao == 4) {
                System.out.println("SISTEMA ENCERRADO");  
            } else {
                System.out.println("Digite novamente.");
            }
            
        } while(opcao != 4);
    }
    
}
