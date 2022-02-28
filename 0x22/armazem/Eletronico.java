public class Eletronico{
    private String descricao;
    private double preco;

    public Eletronico(String nome, double preco) {
        this.descricao = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[%s] R$ %f", getDescricao(), getPreco());
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }


}
