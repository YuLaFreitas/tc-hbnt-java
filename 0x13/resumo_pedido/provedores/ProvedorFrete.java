package provedores;

public interface ProvedorFrete{
    public TipoProvedorFrete obterTipoProverFrete();
    public Frete calcularFrete(double peso, double valor);

}
