public class Numero {

	 public static int dividir(int a, int b){
        int resultado = 0;
        try{
            resultado = a/b;

        }catch (Exception e){
            System.out.printf("Não é possivel dividir por zero \n %d / %d = 0", a, b);
        }

         return resultado;
    }
}