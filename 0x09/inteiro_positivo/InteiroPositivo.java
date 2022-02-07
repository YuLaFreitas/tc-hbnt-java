public class InteiroPositivo {
    private int valor;
    private int contador = 0;

    public InteiroPositivo(int v) {
        this.valor = isPositivo(v);
     }

    public InteiroPositivo(String v) {
        this.valor = isPositivo(Integer.valueOf(v));
    }


    public boolean ehPrimo(){

        for(int i = 1 ; i <= valor ; i++){
            if(valor % i == 0){
                contador++;
            }
        }

        if(contador == 2) {
            return true;
        }

        return false;
    }

    public int getValor() {
        return valor;
    }

    private int isPositivo(int v){
        if(v > 0){
           return v;
        }else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public void setValor(int valor) {
        this.valor = isPositivo(valor);
    }
}
