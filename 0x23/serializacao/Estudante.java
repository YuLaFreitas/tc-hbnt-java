import java.io.Serializable;

public class Estudante implements Serializable {

    private String nome;
    private transient String senha;
    private int idade;

    public Estudante(int idade, String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + getNome() + "', idade='" + getIdade() + "', senha='" + getSenha()
                +"'}";
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }
}
