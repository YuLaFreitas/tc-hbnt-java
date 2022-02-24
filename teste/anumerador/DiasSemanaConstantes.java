public class DiasSemanaConstantes {

    public static void main(String[] args) {
                usandoEnum();
    }

    private static void imprimir(int dia){
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
    }
    private static void usandoEnum(){
        //DiaSemana segunda = DiaSemana.UM;
      //  System.out.println(segunda.name());
    }

    private static void usar(){
        int segunda = Constantes.SEGUNDA;
        /*int terca = Constantes.TERCA;
        int quarta = Constantes.QUARTA;
        int quinta = Constantes.QUINTA;
        int sexta = Constantes.SEXTA;
        int sabado = Constantes.SABADO;
        int domingo = Constantes.DOMINGO;

        System.out.println("Usando constante");
        imprimir(segunda);
        imprimir(terca);
        imprimir(quarta);
        imprimir(quinta);
        imprimir(sexta);
        imprimir(sabado);
        imprimir(domingo);*/

    }
}
