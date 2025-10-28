package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private ArrayList<PedidoCompra> pedidoCompras;
    
    public Pessoa(String n, int anoIns){
        nome = n;
        anoInscricao = anoIns;
        
        pedidoCompras = new ArrayList<PedidoCompra>();
    }
    
    abstract public double calcBonus(int anoAtual);
    
    public void addPedidoCompra(PedidoCompra pc) {
        pedidoCompras.add(pc);
        addCompras(pc.getValor());
    }
    
    public void addCompras(double val){
        totalCompras += val;
    }
    
    public int getNumeroDePedidos() {
        return pedidoCompras.size();
    }
    
    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }  
}
