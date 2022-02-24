import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {


    public static Map<String, List<Pessoa>>obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoaList){
       return pessoaList.stream()
               .collect(
                       Collectors.groupingBy(
                               Pessoa::getCargo,
                               Collectors.filtering(idade -> idade.getIdade() > 40, Collectors.toList())
                       )
               );
    }

    public static Map<String, List<Integer>>obterIdadePorCargo(List<Pessoa> pessoaList){
       return pessoaList.stream()
               .collect(
                       Collectors.groupingBy(
                               Pessoa::getCargo,
                               Collectors.mapping(Pessoa::getIdade, Collectors.toList())
                       )
               );
    }

    public static Map<String, List<Pessoa>>obterPessoasPorCargo(List<Pessoa> pessoaList){
       return pessoaList.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
    }
}
