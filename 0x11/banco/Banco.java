import java.util.ArrayList;

public class Banco {
    private String nomeBa;
    private ArrayList<Agencia> agencias;
    Agencia ag;

    public Banco(String banco){
        agencias = new ArrayList<Agencia>();
        this.nomeBa = banco;
    }

    public boolean adicionarAgencia(String nomeAg) {
        ag = buscarAgencia(nomeAg);
        if(ag != null){
            return false;
        }
        ag = new Agencia(nomeAg);
        agencias.add(ag);
        return true;
    }

    public Agencia buscarAgencia(String nomeAg){
        for(Agencia agencia  : agencias){
            if(agencia.getNome().equals(nomeAg)){
                return agencia;
            }
        }

        return null;
    }

    public boolean adicionarCliente(String nomeAg, String nomeCl, double valorTransacao) {
        ag = buscarAgencia(nomeAg);
        if(buscarAgencia(nomeAg) == null){
            return false;
        }
        ag.novoCliente(nomeCl, valorTransacao);
        ag.adicionarTransacaoCliente(nomeCl, valorTransacao);
        return true;

    }

    public boolean adicionarTransacaoCliente(String nomeAg, String cliente, double valorTransicao) {
        ag = buscarAgencia(nomeAg);

        if(ag == null){
                return false;
            }
            ag.adicionarTransacaoCliente(cliente, valorTransicao);
           return true;
    }

    public boolean listarClientes(String nomeAg, boolean ehImprimir) {
        ag = buscarAgencia(nomeAg);
        StringBuffer sb0;
        StringBuffer sb1;
        if(ag == null){
            return false;
        }

        for(int index = 0 ; index < ag.getClientes().size(); index++) {

            Cliente cliente = ag.getClientes().get(index);

            sb0 = new StringBuffer();

            sb0.append("Cliente: ");
            sb0.append(cliente.getNomeCl());
            sb0.append(String.format(" [%d]", index + 1));

            System.out.println(sb0);
            if(ehImprimir) {
                for(int i = 0 ; i < cliente.getTransacoes().size(); i++) {
                    sb1 = new StringBuffer();

                    sb1.append(String.format("  [%d] ", i+1));
                    sb1.append("valor ");
                    sb1.append(String.format("%.2f", cliente.getTransacoes().get(i)));

                    System.out.println(sb1);
                }
            }
        }
        return true;
    }
}
