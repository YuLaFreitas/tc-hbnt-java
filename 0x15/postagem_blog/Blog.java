import java.util.*;

public class Blog {
    private List<Post> posts = new ArrayList<Post>();

    Map<Categorias, Integer> postMap;
    Map<Autor, Set<Post>> autorSetMap;

    public void adicionarPostagem(Post post) {
        if(posts.isEmpty() || posts.size() < 2){
            posts.add(post);
        }else {
            for (Post postagem : posts) {
             if (postagem.getAutor().equals(post.getAutor()) &&
                 postagem.getTitulo().equals(post.getTitulo())) {
                    throw new IllegalArgumentException("Postagem jah existente");
                }
            }
            posts.add(post);
        }
    }


    public Set<Autor> obterTodosAutores() {
        Set<Autor> postAutor = new TreeSet<>();
        for(Post post : posts){
            postAutor.add(post.getAutor());
        }
        return postAutor;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        postMap = new TreeMap<>();
        for(Post post : posts){
                Categorias categoria = post.getCategoria();
                if(postMap.containsKey(categoria)){
                    int contador = postMap.get(categoria);
                    contador++;
                    postMap.put(post.categoria, contador);
                }else {
                    postMap.put(categoria, 1);
                }
        }
        return postMap;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postAutor = new TreeSet<>();

        for(Post post : posts){
            if(post.getAutor().equals(autor)) {
                postAutor.add(post);
            }
        }
        return postAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postCategoria = new TreeSet<>();

        for(Post post : posts){
            if(post.getCategoria().equals(categoria)) {
                postCategoria.add(post);
            }
        }
        return postCategoria;
    }
    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> categoriasSetMap = new TreeMap<>();
        Set<Post> postagensCategoria;
        for(Post post : posts) {
            postagensCategoria = obterPostsPorCategoria(post.getCategoria());
            categoriasSetMap.put(post.getCategoria(), postagensCategoria);
        }
        return categoriasSetMap;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        autorSetMap = new TreeMap<>();
        for(Post post : posts) {
            Set<Post> postagensAutor = obterPostsPorAutor(post.autor);
            autorSetMap.put(post.autor, postagensAutor);
        }
        return autorSetMap;
    }



   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return Objects.equals(posts, blog.posts) && Objects.equals(postSet, blog.postSet) && Objects.equals(autorSet, blog.autorSet) && Objects.equals(postMap, blog.postMap) && Objects.equals(categoriasSetMap, blog.categoriasSetMap) && Objects.equals(autorSetMap, blog.autorSetMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posts, postSet, autorSet, postMap, categoriasSetMap, autorSetMap);
    }*/


}
