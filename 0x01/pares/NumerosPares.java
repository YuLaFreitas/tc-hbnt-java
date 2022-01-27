public class NumerosPares {

    public static void main(String[] args) {
	for(int n = 0; n <= 100; n++){
            if(n%2 == 0){
                if(n == 98){
                    System.out.print(n+"\n");
                }
                if(n<98){
                    System.out.print(n+", ");
                }
            }
        }
	}
}