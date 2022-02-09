public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao , int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao){
        if(descricao.isEmpty()){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificado() {
        return identificador;
    }

    public void setIdentificado(int identificado) {
        this.identificador = identificado;
    }
}
