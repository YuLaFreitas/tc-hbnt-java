import java.util.*;
import java.util.stream.Collectors;

public class Consulta {


    public static List<Produto> aplicar15PorcentoDescontoEletronicos (List<Produto> produtos){
            produtos.forEach(produto -> {
                if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO)) {
                    produto.setPreco(
                            produto.getPreco() - (produto.getPreco() * 0.15)
                    );
                }
            });

        return produtos;
    }

    public static List<Pedido> obterPedidosComEletronicos (List<Pedido> pedidos){
        return pedidos.stream().filter(
                produto -> produto.getProdutos().stream().anyMatch(
                        a -> a.getCategoria() == CategoriaProduto.ELETRONICO)
        )
                .collect(Collectors.toList());
    }

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
