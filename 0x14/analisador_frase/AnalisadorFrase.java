import java.util.*;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> listFrase = new TreeMap<>();
        List<String> list = new ArrayList<>();
        frase = frase.replace("?","");
        frase = frase.replace(".","");
        frase = frase.replace("!","");

        int i;
        for(String palavra : frase.split(" ")){
            String word = palavra.toLowerCase();
            list.add(word);

             i = Collections.frequency(list, word);

            listFrase.put(word, i);
        }

        return listFrase;


    }

}
