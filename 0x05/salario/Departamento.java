public class Departamento {

    public double valorMeta;
    public double valorAtigidoMeta;

    public Departamento(double valorMeta, double valorAtigidoMeta) {
        setValorAtigindoMeta(valorAtigidoMeta);
        setValorMeta(valorMeta);
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtigidoMeta() {
        return valorAtigidoMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public void setValorAtigindoMeta(double valorAtigidoMeta) {
        this.valorAtigidoMeta = valorAtigidoMeta;
    }

    public boolean alcancouMeta(){
        return getValorMeta() <= getValorAtigidoMeta();
    }
}
