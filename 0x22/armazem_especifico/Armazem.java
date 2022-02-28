import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<E>{

    private Map<String, E> armazem;

    public Armazem() {
        armazem = new HashMap<>();
    }

    public Map<String, E> getArmazem() {
        return armazem;
    }

}
