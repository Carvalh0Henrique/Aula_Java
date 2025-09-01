/**
 *
 * @author Henrique
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao; //false = Dispoível e true = Emprestado
    private double valMultaDiaria;
    
    public Livro(int i, String t) {
        identificacao = i;
        titulo = t;
    }
    
    public void setValMultaDiaria(double m) {
        valMultaDiaria = m;
    }
    
    public int getIdentificacao() {
        return(identificacao);
    }
    
    public String getTitulo() {
        return(titulo);
    }
    
    public boolean getSituacao() {
        return(situacao);
    }
    
    public void emprestar() {
        situacao = true;
    }
    
    public double devolver(int d) {
        situacao = false;
        return(d * valMultaDiaria);
    }
}
