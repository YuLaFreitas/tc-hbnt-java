public class ArmazemDeEletronico extends Armazem<Eletronico>{
        @Override
        public void adicionarAoInventario(String nome, Eletronico valor) {
            getArmazem().put(nome, valor);

        }

        @Override
        public Eletronico obterDoInventario(String nome) {
            return getArmazem().get(nome);
        }

}
