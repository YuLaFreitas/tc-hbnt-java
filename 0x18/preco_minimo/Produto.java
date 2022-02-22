import java.util.Objects;

public class Produto{
    private int  codigo;
    private String nome;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[" + getCodigo() +
                "] " + getNome() +
                " " + getCategoria() +
                String.format(" R$ %.2f", getPreco());
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo && Double.compare(produto.preco, preco) == 0 && Objects.equals(nome, produto.nome) && categoria == produto.categoria;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((codigo == 0.0) ? 0 : codigo);
        result = (int) (prime * result + ((preco == 0.0) ? 0 : preco));
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        return result;
    }

}
