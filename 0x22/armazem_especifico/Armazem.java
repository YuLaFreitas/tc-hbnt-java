import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<E> implements Armazenavel<E>{

    private Map<String, E> armazem = new HashMap<>();

    public Map<String, E> getArmazem() {
        return armazem;
    }

}
