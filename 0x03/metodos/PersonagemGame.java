public class PersonagemGame  {
    private String nome;
    private int SaudeAtual;

    public void tomarDano(int quantidadeDeDano){

        int status = this.SaudeAtual - quantidadeDeDano;

        setSaudeAtual(Math.max(status, 0));
    }

    public void receberCura(int quantidadeDeCura){
        int status = this.SaudeAtual + quantidadeDeCura;
        setSaudeAtual(Math.min(status, 100));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return SaudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.SaudeAtual = saudeAtual;
    }
}
