package provedores;
public class JadLog implements ProvedorFrete{

    @Override
    public TipoProvedorFrete obterTipoProverFrete() {
        return TipoProvedorFrete.JADLOG;
    }
    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso <= 2000) {
            return new Frete(valorPedidoPorCem(valor, 0.045), obterTipoProverFrete());
        }else {
            return  new Frete(valorPedidoPorCem(valor, 0.07), obterTipoProverFrete());
        }
    }

    private double valorPedidoPorCem(double valor, double percentual){
        return valor* percentual;
    }
}
