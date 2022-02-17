import java.util.*;

public class Blog {

    ArrayList<Post> postagens;
    Set<String> postSet;
    Map<String, Integer> postMap;
    int contador = 1;

    public Blog(){
        postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        postagens.add(post);
    }

    public Set<String> obterTodosAutores() {
        postSet = new LinkedHashSet<>();
        for(Post post : postagens){
            postSet.add(post.getAutor());
        }
        return postSet;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Set<String> postList = new HashSet<>();

        postMap = new HashMap<>();

        for(Post post : postagens){
            postMap.put(post.categoria, contador);

            if(!postList.add(post.getCategoria())){
                contador++;
            }
        }

        return postMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blog)) return false;
        Blog blog = (Blog) o;
        return contador == blog.contador && Objects.equals(postagens, blog.postagens) && Objects.equals(postSet, blog.postSet) && Objects.equals(postMap, blog.postMap);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((postagens == null) ? 0 : postagens.hashCode());
        result = prime * result + ((postSet == null) ? 0 : postSet.hashCode());
        result = prime * result + ((postMap == null) ? 0 : postMap.hashCode());
        return result;
    }
}
