import java.util.Map;

public class ArmazemDeComida extends Armazem<Comida> implements Armazenavel<Comida> {
    Armazem<Comida> armazem;
    public ArmazemDeComida() {
        this.armazem = new Armazem<Comida>() {
            @Override
            public Map<String, Comida> getArmazem() {
                return super.getArmazem();
            }
        };
    }

    @Override
    public void adicionarAoInventario(String nome, Comida valor) {
       armazem.getArmazem().put(nome, valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return armazem.getArmazem().get(nome);
    }
}
