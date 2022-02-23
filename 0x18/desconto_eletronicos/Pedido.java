import java.util.*;

public class Pedido{
    private final int  codigo;
    private List<Produto> produtos;
    private final Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "["+getCodigo()+"] "+ getClientes().getNome();
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getClientes() {
        return cliente;
    }
}
