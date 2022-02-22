import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> livro = pedido.getProdutos();

        return livro.stream().filter(book -> book.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());

    }

}
