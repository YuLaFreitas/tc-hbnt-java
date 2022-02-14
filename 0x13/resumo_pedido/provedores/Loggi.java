package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
    @Override
    public Frete calcularFrete(double peso, double valor) {

            if(peso <= 5000) {
                return new Frete(valorPedidoPorCem(valor, 0.04), obterTipoProvedorFrete());
            }else {
                return new Frete(valorPedidoPorCem(valor, 0.12), obterTipoProvedorFrete());
            }

    }

    private double valorPedidoPorCem(double valor, double percentual){
        return valor* percentual;
    }
}
