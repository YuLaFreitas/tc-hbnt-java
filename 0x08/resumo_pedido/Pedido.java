import produtos.Livro;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;


    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public void apresentarResumoPedido(){
            System.out.println("------- RESUMO PEDIDO -------");
        double total = 0;
        for(ItemPedido valor : getItens()) {
            System.out.print(
                    "Tipo: " + valor.getProduto().getClass().getSimpleName() +
                    "  Titulo: " + valor.getProduto().getTitulo());
            System.out.printf("  Preco: %.2f", valor.getProduto().obterPrecoLiquido());
            System.out.print("  Quant: " + valor.getQuantidade());
            System.out.printf("  Total: %.2f\n", valor.getProduto().obterPrecoLiquido() * valor.getQuantidade());

            total += calcularTotal(valor);
        }
            System.out.println("----------------------------");
            System.out.printf("DESCONTO: %.2f\n", getPercentualDesconto() * somador);
            System.out.printf("TOTAL PRODUTOS: %.2f\n", total);
            System.out.println("----------------------------");
            System.out.printf("TOTAL PEDIDO: %.2f\n", somador - (getPercentualDesconto()*somador));
            System.out.println("----------------------------");

    }
    double somador = 0;
    public double calcularTotal(ItemPedido valor){

        somador += valor.getQuantidade() * valor.getProduto().obterPrecoLiquido();
        return valor.getQuantidade() * valor.getProduto().obterPrecoLiquido();
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto/100;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
