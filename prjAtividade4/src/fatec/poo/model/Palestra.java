
package fatec.poo.model;

/**
 *
 * @author Henrique
 */
public class Palestra {
    private String data;
    private String tema;
    private double valor;    
    private Palestrante palestrante;    
    private Participante[] participantes;
    private int numFunc;

    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
        
        participantes = new Participante[5];
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getTema() {
        return tema;
    }

    public double getValor() {
        return valor;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }   

    public void addParticipante(Participante p) {
        participantes[numFunc] = p;
        numFunc++;
    }
    
    public double calcTotalFaturado() {
        double valorTotal = valor;
        
        for(int i = 0; i < numFunc; i++) {
            switch (participantes[i].getTipo()) {
                case 'C':
                    valorTotal += valor;
                    break;
                case 'E':
                    valorTotal += (valor * 0.85);
                    break;
                case 'I':
                    valorTotal += (valor * 0.8);
                    break;
            }   
        }
        
        return(valorTotal);
    }
}
