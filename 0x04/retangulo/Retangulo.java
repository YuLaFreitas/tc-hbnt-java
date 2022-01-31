public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;


    public void setLargura(int i) {
        this.largura = test(i, "Largura");;

    }

    public void setAltura(int i) {
        this.altura = test(i, "Altura");
    }

    public double getLargura() {

            return this.largura;
    }

    public double test(int i, String word){
        if(i > 0 ){
            return i;
        }else{
            throw new IllegalArgumentException(word + " deve ser maior ou igual a 0");
        }
    }

    public double getAltura() {
        return this.altura;
    }

}
