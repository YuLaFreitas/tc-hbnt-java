import java.util.ArrayList;

public class Celular {
    ArrayList<Contato> contatos = new ArrayList<>();
    public Celular(){    }

    public Celular(ArrayList<Contato> contatoList){
        this.contatos = contatoList;
    }

    public void adicionarContato(Contato addContato) {
        int pos = obterPosicaoContato(addContato.getNome());
        if(pos != -1) {
                throw new IllegalArgumentException(
                        "Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(addContato);
    }


    public void listarContatos() {
        contatos.forEach(contato -> {
            System.out.println(contato.getNome() + " -> "+contato.getTelefone() + " (" + contato.getTipoNumero() + ")");
        });
    }

    public int obterPosicaoContato(String nomeContato){
        for(Contato contato : contatos){
            if(contato.getNome().equals(nomeContato)){
                return contatos.indexOf(contato);
            }
        }
        return -1;
    }

    public void atualizarContato(Contato antigo, Contato novo){
        int posAntigo = obterPosicaoContato(antigo.getNome());
            if (posAntigo == -1) {
                throw new IllegalArgumentException(
                        "Nao foi possivel modificar contato. Contato nao existe"
                );
            }

            if(!(antigo.getNome() .equals(novo.getNome())) && buscarContato(novo.getNome()) != null){
                throw new IllegalArgumentException(
                        "Nao foi possivel modificar contato. Contato jah existente com esse nome"
                );
            }

        contatos.set(posAntigo,novo);

    }

    private Contato buscarContato(String nomeContato){
        for(Contato contato : contatos){
            if (contato.getNome().equals(nomeContato)) {
                return contato;
            }
        }
        return null;
    }

    public void removerContato(Contato contato){
        int pos = obterPosicaoContato(contato.getNome());
        if(pos == -1){
            throw new IllegalArgumentException(
                    "Nao foi possivel remover contato. Contato nao existe"
            );
        }
        contatos.remove(pos);
    }
}
