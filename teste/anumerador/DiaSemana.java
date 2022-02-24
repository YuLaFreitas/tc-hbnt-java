public enum DiaSemana {

    UM("UM"), DOIS("DOIS"), TRES("TRES");

    String nome = "NOME";

    private DiaSemana(String nome)
    {
        this.nome = nome;
    }

    void metodo()
    {
        System.out.println(nome);
    }
}
