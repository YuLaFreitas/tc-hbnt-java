package comida;

public abstract class Comida {
    protected int pontosDeFelicidade;

    public Comida() {
        setPontosDeFelicidade(getPontosDeFelicidade());
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
}
