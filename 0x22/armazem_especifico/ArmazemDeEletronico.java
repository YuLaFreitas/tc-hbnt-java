import java.util.Map;

public class ArmazemDeEletronico extends Armazem<Eletronico> implements Armazenavel<Eletronico>{
    Armazem<Eletronico> armazem;

    public ArmazemDeEletronico() {
        this.armazem = new Armazem<Eletronico>() {
            @Override
            public Map<String, Eletronico> getArmazem() {
                return super.getArmazem();
            }
        };
    }

    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {
        armazem.getArmazem().put(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return armazem.getArmazem().get(nome);
    }
}
