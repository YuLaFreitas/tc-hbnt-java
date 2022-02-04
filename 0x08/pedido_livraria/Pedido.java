public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;


    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public double calcularTotal(){
        double somador = 0;

        for(ItemPedido valor : getItens()) {

            somador += valor.getQuantidade() * valor.getProduto().obterPrecoLiquido();

        }
        return somador - (getPercentualDesconto()*somador);
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
