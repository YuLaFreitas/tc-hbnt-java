import java.util.LinkedList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtoList, CriterioFiltro criterio){
        List<Produto> lista = new LinkedList<>();

        for(Produto produto : produtoList){
            if(criterio.testar(produto)){
                lista.add(produto);
            }
        }

        return lista;
    }
}
