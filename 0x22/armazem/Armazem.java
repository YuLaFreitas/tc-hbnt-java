import java.util.HashMap;
import java.util.Map;

public class Armazem<E> implements Armazenavel<E>{

    private Map<String, E> armazem;

    public Armazem() {
        armazem = new HashMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, E valor) {
        armazem.put(nome, valor);
    }

    @Override
    public E obterDoInventario(String nome) {
        return armazem.get(nome);
    }
}
