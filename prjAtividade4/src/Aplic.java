
import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;
import java.text.DecimalFormat;


/**
 *
 * @author Henrique
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //INSTANCIA DOIS OBJETOS DA CLASSE PALESTRA
        Palestra objPales1 = new Palestra("Filosofia", 1000);
        Palestra objPales2 = new Palestra("Sociologia", 1500);
        
        //INSTANCIA UM OBJETO DA CLASSE PALESTRANTE
        Palestrante objPal = new Palestrante("Fatec", "000.000.000-00", "Clóvis de Barros");
        objPal.setTaxaCobranca(40);
        objPal.addPalestra(objPales1);
        objPal.addPalestra(objPales2);
        
        //INSTANCIA CINCO OBJETOS DA CLASSE PARTICIPANTE
        Participante objPar1 = new Participante('C', "111.111.111-11", "Hiago");
        Participante objPar2 = new Participante('E', "222.222.222-22", "Henrique");
        Participante objPar3 = new Participante('E', "333.333.333-33", "Beatriz");
        Participante objPar4 = new Participante('I', "444.444.444-44", "Maria");
        Participante objPar5 = new Participante('I', "555.555.555-55", "Plínio");
        
        //ADICIONA PARTICIPANTES A PALESTRA
        objPales1.addParticipante(objPar1);
        objPales1.addParticipante(objPar2);
        objPales1.addParticipante(objPar3);
        objPales2.addParticipante(objPar4);
        objPales2.addParticipante(objPar5);
        
        //INTERAÇÃO COM O USUÁRIO
        System.out.println("CPF Palestrante: " + objPal.getCpf());
        System.out.println("Nome: " + objPal.getNome());
        System.out.println("Taxa de cobrança: " + objPal.getTaxaCobranca() + "%");
        System.out.println("Valor total a receber pelas palestras: R$ " + df.format(objPal.calcTotalReceberPalestras()));
    }    
}
