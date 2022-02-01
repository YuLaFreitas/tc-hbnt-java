import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends  ContaBancariaBasica {
    private int quantidadeTransacoes; // quantidade de transações efetudas na conta, seja saque o depósito.

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);

    }

    @Override
    public void depositar(double i) throws OperacaoInvalidaException {
        double imp = i - 0.1;
        super.depositar(imp);

    }

    @Override
    public void sacar(double i) {
        saldo = saldo - i - 0.1;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes++;
    }
}