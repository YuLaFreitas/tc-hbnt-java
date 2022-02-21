import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtoList, Predicate<Produto> criterio){
        List<Produto> lista = new LinkedList<>();

        for(Produto produto : produtoList){
            if(criterio.test(produto)){
                lista.add(produto);
            }
        }

        return lista;
    }
}
