public class Departamento {

    public double valorMeta;
    public double valorAtigindoMeta;

    public Departamento(double valorMeta, double valorAtigindoMeta) {
        setValorAtigindoMeta(valorAtigindoMeta);
        setValorMeta(valorMeta);
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtigindoMeta() {
        return valorAtigindoMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public void setValorAtigindoMeta(double valorAtigindoMeta) {
        this.valorAtigindoMeta = valorAtigindoMeta;
    }

    public boolean alcancouMeta(){
        return getValorMeta() <= getValorAtigindoMeta();
    }
}
