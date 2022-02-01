public class Departamento {

    public double valorMeta;
    public double valorAtingidoMeta;


    public Departamento(double valorMeta, double valorAtingidoMeta) {
        setValorAtigindoMeta(valorAtingidoMeta);
        setValorMeta(valorMeta);
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public void setValorAtigindoMeta(double valorAtigidoMeta) {
        this.valorAtingidoMeta = valorAtigidoMeta;
    }

    public boolean alcancouMeta(){
        return getValorMeta() <= getValorAtingidoMeta();
    }
}
