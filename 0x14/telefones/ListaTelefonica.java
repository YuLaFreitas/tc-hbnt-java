import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> hashMap;
    ArrayList<Telefone> numero;

    public ListaTelefonica(){
        hashMap = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if(buscar(nome) == null){
            numero = new ArrayList<>();
            numero.add(telefone);
            hashMap.put(nome, numero);
        }else {
            numero.add(telefone);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        if(hashMap.isEmpty()){
            return null;
        }

        return hashMap.get(nome);

    }
}
