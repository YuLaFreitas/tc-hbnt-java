import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> listaTelefonica;
    HashSet<Telefone> numero;

    public ListaTelefonica(){
        listaTelefonica = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        numero = new HashSet<>();
        if (listaTelefonica.containsKey(nome) && listaTelefonica.get(nome).contains(telefone)) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }
        //ForEach não pode ser aplicado em Map, então para usar a HashMap listaTelefonica é necessário a conversão usado .entrySet()
        // E usando o .entrySet também é necessário alterar o tipo da variável para Map.Entry
        for (Map.Entry<String, HashSet<Telefone>> lista: listaTelefonica.entrySet()) {
            if(lista.getValue().contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        }
        if (listaTelefonica.containsKey(nome)){
            //se o telefone referênte ao nome constar na lista de telefones adicione mais um
            listaTelefonica.get(nome).add(telefone);
        }else{
            numero.add(telefone);
            listaTelefonica.put(nome,numero);
        }

        return numero;
    }

    public HashSet<Telefone> buscar(String nome) {
        if(listaTelefonica.isEmpty()){
            return null;
        }
        return listaTelefonica.get(nome);
    }
}
