import fatec.poo.model.PedidoCompra;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */

public class Aplic {
    public static void main(String[] args) {   
        //INSTANCIAÇÃO DE CLASSES JDK
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        PedidoCompra[] cadPedidos = new PedidoCompra[10];
        
        //VARIAVEIS AUXILIARES  
        int tipoPessoa;
        int medNumPedidoCompra;       
        int qtdPedidos = 0;
        
        System.out.println("--- PESSOA FÍSICA ---");
        System.out.print("Digite o numero do seu CPF: ");
        String medCPF = entrada.next();

        System.out.print("Digite seu nome: ");
        String medNomePF = entrada.next();

        System.out.print("Digite o ano de inscrição: ");
        int medAnoInscricaoPF = entrada.nextInt();
        
        //INSTANCIA UM OBJETO DA CLASSE PessoaFisica
        PessoaFisica pf = new PessoaFisica(medCPF, medNomePF, medAnoInscricaoPF);
        
        System.out.print("Digite o valor base: ");
        pf.setBase(entrada.nextDouble());
              
        System.out.println("\n--- PESSOA JURÍDICA ---");
        System.out.print("Digite o numero do seu CGC: ");
        String medCGC = entrada.next();

        System.out.print("Digite seu nome: ");
        String medNomePJ = entrada.next();

        System.out.print("Digite o ano de inscrição: ");
        int medAnoInscricaoPJ = entrada.nextInt();  
        
        //INSTANCIA UM OBJETO DA CLASSE PessoaJuridica
        PessoaJuridica pj = new PessoaJuridica(medCGC, medNomePJ, medAnoInscricaoPJ);
        
        System.out.print("Digite a taxa de incentivo: ");
        pj.setTaxaIncentivo(entrada.nextDouble());
        
        do {
            System.out.print("\nQuantos pedidos de compras foram feitos: ");
            qtdPedidos = entrada.nextInt();
            
            if(qtdPedidos > 10) {
                System.out.println("O progama não suporta está quantidade de pedidos.");
            }
        } while(qtdPedidos > 10);
        
        for(int i = 0; i < qtdPedidos; i++) {
            System.out.println("\n\n--- Cadastro do Pedido " + (i + 1) + " ---");
            System.out.print("Digite o número do pedido de compra: ");
            medNumPedidoCompra = entrada.nextInt();
            
            PedidoCompra objPedidoCompra = new PedidoCompra(medNumPedidoCompra);
            
            System.out.print("Digite a data do pedido: ");
            objPedidoCompra.setDataPedido(entrada.next());
            
            System.out.print("Digite o valor: R$ ");
            objPedidoCompra.setValor(entrada.nextDouble());
            
            cadPedidos[i] = objPedidoCompra;
            
            do {
                System.out.print("\nAssociar pedido ao: \n[1] - " + pf.getNome() + "\n[2] - " + pj.getNome() + "\nDigite aqui: ");
                tipoPessoa = entrada.nextInt();

                if(tipoPessoa == 1) {
                    objPedidoCompra.setPessoa(pf);
                    pf.addPedidoCompra(cadPedidos[i]);
                } else if(tipoPessoa == 2) {
                    objPedidoCompra.setPessoa(pj);
                    pj.addPedidoCompra(cadPedidos[i]);
                } else {
                    System.out.println("Opção inválida!");
                }
            } while(tipoPessoa != 1 && tipoPessoa != 2);
        }
        
        System.out.print("\nPara calcular o bônus, digite o ano atual: ");
        int anoAtual = entrada.nextInt();

        System.out.println("Ano Atual: " + anoAtual);
        System.out.println("\n--- Pessoa Física ---");
        System.out.println("Data de Inscrição: " + pf.getAnoInscricao());
        System.out.println("CPF: " + pf.getCPF());
        System.out.println("Nome: " + pf.getNome()); 
        System.out.println("Número de pedidos: " + pf.getNumeroDePedidos());
        //System.out.println("Base: " + pf.getBase());
        System.out.println("Total Compras: " + df.format(pf.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pf.calcBonus(anoAtual)));
        
        System.out.println("\n\n--- Pessoa Jurídica ---");
        System.out.println("Data de Inscrição: " + pj.getAnoInscricao());
        System.out.println("CGC: " + pj.getCGC());
        System.out.println("Nome: " + pj.getNome());   
        System.out.println("Número de pedidos: " + pj.getNumeroDePedidos());
        //System.out.println("Taxa Incentivo: " + pj.getTaxaIncentivo() + "%");
        System.out.println("Total Compras: " + df.format(pj.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pj.calcBonus(anoAtual)));
    }
}
