import java.util.ArrayList;
import java.util.List;

public class Biblioteca<E>{
    public List<E> getLista() {
        return lista;
    }

    private List<E> lista;

    public Biblioteca() {
            lista = new ArrayList<>();
            }

    public void adicionarMidia(E e){
        lista.add(e);
    }

    public List<E> obterListaMidias(){
        return getLista();
    }
}
