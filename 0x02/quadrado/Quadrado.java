public class Quadrado {

	 public static double area(double a){
             if (a <= 0) {
                 throw new IllegalArgumentException(
                         "Lado deve possuir valor positivo");
             }
         return Math.pow(a, 2);
    }
}
