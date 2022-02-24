package provedores;
public class JadLog implements ProvedorFrete{
    private static final TipoProvedorFrete tipoProvedorFrete = TipoProvedorFrete.JADLOG;
    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete;
        if(peso <= 2000) {
            frete = new Frete(valorPedidoPorCem(valor, 0.045), obterTipoProvedorFrete());
        }else {
            frete = new Frete(valorPedidoPorCem(valor, 0.07), obterTipoProvedorFrete());
        }
        return frete;
    }

    private double valorPedidoPorCem(double valor, double percentual){
        return valor* percentual;
    }
}
