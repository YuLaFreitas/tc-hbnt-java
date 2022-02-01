public class Empregado {

    public double salarioFixo;

    public Empregado(double salarioFixo) {
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

    public double calcularBonus(Departamento departamentoEngenharia) {
        if (departamentoEngenharia.alcancouMeta()){
            return salarioFixo * 0.10;
        }else {
            return 0;
        }

    }
}
