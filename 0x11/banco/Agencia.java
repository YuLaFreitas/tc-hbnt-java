import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(){

    }

    public Agencia(String nome){
        this.nome = nome;
        clientes = new ArrayList<Cliente>();
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    private Cliente buscarCliente(String nome){

        for(Cliente cliente : clientes){
            if(cliente.getNomeCl().equals(nome)){
                return cliente;
            }
        }
        return null;
    }

    public boolean novoCliente(String nome, double valor){
         if(buscarCliente(nome) == null){
             return clientes.add(new Cliente(nome, valor));
         }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nome, double valor){
        Cliente cliente = buscarCliente(nome);
        if(cliente != null){
            cliente.adicionarTransacao(valor);
            return true;
        }
        return false;
    }

    public String getNome(){
        return nome;
    }
}
