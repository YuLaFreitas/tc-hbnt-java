
public class ContaBancariaControlada extends ContaBancariaBasica {


    private double saldoMinimo; // saldo mínimo que conta deve ter para não ser taxada.
    private double valorPenalidade; //o valor de penalidade a aplicar à conta quaso o saldo esteja abaixo do saldo mínimo

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual,
                                   double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);

        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }
    @Override
    public void aplicarAtualizacaoMensal(){

        if(super.getSaldo() <= getSaldoMinimo() ){
            double s = super.getSaldo() -
                    getValorPenalidade() + super.calcularJurosMensal() -
                    super.calcularTarifaMensal();
            super.setSaldo(s);
        }
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    public void setValorPenalidade(double valorPenalidade) {
        this.valorPenalidade = valorPenalidade;
    }

}
