public class PersonagemGame  {
    private String nome;
    private int SaudeAtual;
    private String status;

    public void tomarDano(int quantidadeDeDano){

        public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        setNome(nome);
        }


        int vida = this.SaudeAtual - quantidadeDeDano;

        setSaudeAtual(Math.max(vida, 0));
    }

    public void receberCura(int quantidadeDeCura){
        int vida = this.SaudeAtual + quantidadeDeCura;
        setSaudeAtual(Math.min(vida, 100));
    }

    public String getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome == null || nome == "" ? this.nome : nome;
    }

    public int getSaudeAtual() {
        return SaudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
            this.SaudeAtual = !(saudeAtual >= 0) ? 0 : saudeAtual;
            status =  this.SaudeAtual > 0 ? "vivo" : "morto" ;

    }
}
