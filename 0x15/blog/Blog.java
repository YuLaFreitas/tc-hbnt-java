import java.util.*;

public class Blog {

    ArrayList<Post> posts;
    Set<String> postSet;
    Map<String, Integer> postMap;
    int contador = 1;

    public Blog(){
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        postSet = new LinkedHashSet<>();
        for(Post post : posts){
            postSet.add(post.getAutor());
        }
        return postSet;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Set<String> postList = new HashSet<>();

        postMap = new HashMap<>();

        for(Post post : posts){
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
        return contador == blog.contador && Objects.equals(posts, blog.posts) && Objects.equals(postSet, blog.postSet) && Objects.equals(postMap, blog.postMap);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((posts == null) ? 0 : posts.hashCode());
        result = prime * result + ((postSet == null) ? 0 : postSet.hashCode());
        result = prime * result + ((postMap == null) ? 0 : postMap.hashCode());
        return result;
    }
}
