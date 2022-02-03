public class Domestico extends Item {

    public Domestico(String nome, double preco, double quantidade, String unidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
        setUnidade(unidade);
    }

    @Override
    public void comprar(){

    }
}
