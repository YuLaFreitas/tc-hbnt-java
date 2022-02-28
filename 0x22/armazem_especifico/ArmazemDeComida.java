public class ArmazemDeComida extends Armazem<Comida> {

    @Override
    public void adicionarAoInventario(String nome, Comida valor) {
        getArmazem().put(nome, valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return getArmazem().get(nome);
    }
}
