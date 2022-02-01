public class Gerente extends Empregado{


    public double salarioFixo;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
        setSalarioFixo(salarioFixo);
    }


    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularSalarioTotal(Departamento departamentoEngenharia) {
        return calcularBonus(departamentoEngenharia) + getSalarioFixo();
    }

    @Override
    public double calcularBonus(Departamento departamentoEngenharia) {
        if (departamentoEngenharia.alcancouMeta()){
            return salarioFixo * 0.20 + (0.01 * (departamentoEngenharia.getValorAtingidoMeta() - departamentoEngenharia.getValorMeta()));
        }else {
            return 0;
        }
    }
}
