import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int i){
        return numeros.indexOf(i);
    }

    public static void adicionarNumero(List<Integer> numeros, int i) {
        int pos = buscarPosicaoNumero(numeros, i);
                if (pos != -1) {
                    throw new IllegalArgumentException("Numero jah contido na lista");
                }
        numeros.add(i);
    }

    public static void removerNumero(List<Integer> numeros, int i){
        int pos = buscarPosicaoNumero(numeros, i);
        if ( pos == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
            numeros.remove(pos);

    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir , int numeroSubstituto){
            int pos = buscarPosicaoNumero(numeros, numeroSubstituir);
               if(pos == -1) {
                    numeros.add(numeroSubstituto);
               }else {
                   numeros.set(pos, numeroSubstituto);
               }
    }
}
