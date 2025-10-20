
package fatec.poo.model;

/**
 *
 * @author Henrique
 */
public class Participante extends Pessoa {
    private char tipo; // C = Comum | E = Estudante | I = Idoso

    public Participante(char tipo, String cpf, String nome) {
        super(cpf, nome);
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }    
}
