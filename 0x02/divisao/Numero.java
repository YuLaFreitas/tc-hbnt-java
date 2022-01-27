public class Numero {

	 public static String dividir(int a, int b){
        String resultado = "";
        int r = 0;
        try{
            r = a/b;
        }catch (Exception e){
            resultado = "Nao eh possivel dividir por zero\n";
        }finally {
            resultado += a + " / " + b + " = " + r;
        }
         return resultado;
    }
}
