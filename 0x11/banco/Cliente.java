import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes ;

    public Cliente(){    }

    public Cliente(String nomeCl, double valor){
        this.nome = nomeCl;

        transacoes = new ArrayList<Double>();

    }

    public String getNomeCl() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
       // transacoes = new ArrayList<Double>();

        return transacoes;
    }

    public void adicionarTransacao(double valor){
      transacoes.add(valor);
    }
}
