package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public TipoProvedorFrete obterTipoProverFrete() {
        return TipoProvedorFrete.LOGGI;
    }
    @Override
    public Frete calcularFrete(double peso, double valor) {

            if(peso <= 5000) {
                return new Frete(valorPedidoPorCem(valor, 0.04), obterTipoProverFrete());
            }else {
                return new Frete(valorPedidoPorCem(valor, 0.12), obterTipoProverFrete());
            }

    }

    private double valorPedidoPorCem(double valor, double percentual){
        return valor* percentual;
    }
}
