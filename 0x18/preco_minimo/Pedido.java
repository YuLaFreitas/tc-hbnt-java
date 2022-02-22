import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Pedido{
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + (codigo);
        result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
        result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return codigo == pedido.codigo && Objects.equals(produtos, pedido.produtos) && Objects.equals(clientes, pedido.clientes);
    }
}
