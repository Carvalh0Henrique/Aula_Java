
/**
 *
 * @author Henrique
 */
public class Aluno {
    //INDEPENDENTE SE O DIAGRAMA PASSA O ATRIBUTO COM A LETRA MAIÚSCULA, DEVE SEGUIR A NOTAÇÃO (Camel Case)
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    //METODOS SETTERS
    public void SetRA(int ra) {
        RA = ra;
    }
    
    public void setNtPrv1(double p1) {
        NtPrv1 = p1;
    }
    
    public void setNtPrv2(double p2) {
        NtPrv2 = p2;
    }
    
    public void setNtTrab1(double t1) {
        NtTrab1 = t1;
    }
    
    public void setNtTrab2(double t2) {
        NtTrab2 = t2;
    }
    
    //METODOS GETTERS
    public int getRA() {
        return(RA);
    }
    
    public double getNtPrv1() {
        return(NtPrv1);
    }
    
    public double getNtPrv2() {
        return(NtPrv2);
    }
    
    public double getNtTrab1() {
        return(NtTrab1);
    }
    
    public double getNtTrab2() {
        return(NtTrab2);
    }
    
    //METODOS PARA CALCULO DA MEDIA
    public double calcMediaProva() {
        return(0.75 * (NtPrv1 + 2 * NtPrv2) / 3);
    }
    
    public double calcMediaTrab() {
        return(0.25 * (NtTrab1 + NtTrab2) / 2);        
    }
    
    public double calcMediaFinal() {
        //Um método só pode chamar outro método se ambos estiverem na mesma classe ou as classes tiverem um vinculo de herança
        return(calcMediaProva() + calcMediaTrab());
    }
    
    public boolean isAprovado() {        
        return(calcMediaFinal() >= 5.0);
    }
}
