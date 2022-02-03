import comida.*;
import humor.*;

public class Personagem {
    private int pontosDeFelicidade;

    public Humor obterHumorAtual(){
        return getPontosDeFelicidade() < -5 ?
                new Irritado() :
                (getPontosDeFelicidade() >= -5 && getPontosDeFelicidade() <= 0) ?
                        new Triste() :
                        (getPontosDeFelicidade() >= 1 && getPontosDeFelicidade() <= 15) ?
                                new Feliz() : new MuitoFeliz();
    }

    public void comer(Comida[] comidas){
        for(Comida pontos: comidas) {

            setPontosDeFelicidade(this.pontosDeFelicidade += pontos.getPontosDeFelicidade());

        }
    }

    @Override
    public String toString(){
        return getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getSimpleName();
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
}
