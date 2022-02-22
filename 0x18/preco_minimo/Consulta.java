import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterProdutosPorPrecoMinimo  (List<Produto> produtos, double precoMinimo){
                return produtos.stream()
                        .filter(min -> min.getPreco() >= precoMinimo)
                        .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco (List<Produto> produtos){
                return produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed()).collect(Collectors.toList())
                        .get(0);
    }

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> livro = pedido.getProdutos();

        return livro.stream().filter(book -> book.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());

    }



}
