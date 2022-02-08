import java.util.ArrayList;
import java.util.List;

public class Pedido {
    ArrayList<PedidoCookie> cookies;

    public Pedido() {
    cookies = new ArrayList<PedidoCookie>();
    }

    public List<PedidoCookie> adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
        return cookies;
    }

    int contador;
    public int obterTotalCaixas() {
        contador = 0;
        for(PedidoCookie pedidoCookie : cookies){
            contador += pedidoCookie.getQuantidadeCaixas();
        }
        return contador;
    }
    int quantRemovidas;
    public int removerSabor(String sabor) {
        quantRemovidas = 0;
        for(PedidoCookie pedidoCookie : cookies){

            if(pedidoCookie.getSabor().equals(sabor)){
                quantRemovidas += pedidoCookie.getQuantidadeCaixas();
            }
        }
        cookies.removeIf(pedido -> pedido.getSabor().equals(sabor));
        return quantRemovidas;
    }

}
