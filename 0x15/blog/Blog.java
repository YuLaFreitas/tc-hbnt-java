import java.util.*;

public class Blog {

    List<Post> postagens;
    Set<String> postSet;
    Map<String, Integer> postMap;
    public Blog(){
        postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        postagens.add(post);
    }

    public Set<String> obterTodosAutores() {
        postSet = new TreeSet<>();
        for(Post post : postagens){
            postSet.add(post.getAutor());
        }
        return postSet;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        postSet = new TreeSet<>();
        postMap = new TreeMap<String, Integer>();

        for(Post post : postagens){
            String categoria = post.getCategoria();
            if(postMap.containsKey(categoria)) {
                int contador = postMap.get(categoria) ;
                contador++;
                postMap.put(categoria, contador);
            }else {
                postMap.put(categoria, 1);

            }
        }
        return postMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return Objects.equals(postagens, blog.postagens) && Objects.equals(postSet, blog.postSet) && Objects.equals(postMap, blog.postMap);
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
