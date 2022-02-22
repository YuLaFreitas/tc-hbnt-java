import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final int  codigo;
    private List<Produto> produtos;
    private final Cliente clientes;

    public Pedido(int codigo, List<Produto> produtos, Cliente clientes) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.clientes = clientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getClientes() {
        return clientes;
    }

}
