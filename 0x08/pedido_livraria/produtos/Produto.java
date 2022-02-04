package produtos;

public abstract class Produto{
    private String titulo;
    private int ano;
    private String pais;
    private double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        super();
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
       setPrecoBruto(precoBruto);
    }


    public abstract double obterPrecoLiquido();

    public double getPrecoBruto() {
        return precoBruto;
    }

    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }
}