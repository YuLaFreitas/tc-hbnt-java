package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public TipoProvedorFrete obterTipoProverFrete() {
        return TipoProvedorFrete.SEDEX;
    }
    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso <= 1000) {
          return new Frete(valorPedidoPorCem(valor, 0.05), obterTipoProverFrete());
        }else {
          return new Frete(valorPedidoPorCem(valor, 0.10), obterTipoProverFrete());
        }

    }

    private double valorPedidoPorCem(double valor, double percentual){
        return valor* percentual;
    }
}
