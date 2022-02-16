import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] ints) {

        HashSet<Integer> numeros = new HashSet<Integer>();
        TreeSet<Integer> colecao = new TreeSet<>();

        for(Integer i : ints){
            if(!numeros.add(i)){
                colecao.add(i);
            }
        }
        return colecao;

    }
}
