package provedores;

public class Sedex implements ProvedorFrete {
    private static final TipoProvedorFrete tipoProvedorFrete = TipoProvedorFrete.SEDEX;

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso <= 1000) {
          return new Frete(valorPedidoPorCem(valor, 0.05), obterTipoProvedorFrete());
        }else {
          return new Frete(valorPedidoPorCem(valor, 0.10), obterTipoProvedorFrete());
        }

    }

    private double valorPedidoPorCem(double valor, double percentual){
        return valor* percentual;
    }
}
