public class Quadrado extends Retangulo{
    private double lado;

    @Override
    public double area() {
        setLado(getLado());
        super.altura = getLado();
        super.largura = getLado();
        return super.altura*super.largura;
    }

    public double getLado() {
        Retangulo teste = new Retangulo();
        return teste.test((int) lado, "Lado");
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return String.format("[Quadrado] %.02f", lado);
    }
}
