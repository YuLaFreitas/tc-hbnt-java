import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args){
        Locale.setDefault(new Locale("pt", "BR"));

        float taxa = 0.2456f;
        float valor = 7654.321f;

        NumberFormat nb = NumberFormat.getInstance(Locale.US);
        nb.setRoundingMode(RoundingMode.DOWN);
        DecimalFormat dt = new DecimalFormat("0.00");

        System.out.println("Valor: R$ " + nb.format(valor));

        System.out.println("Taxa: " + dt.format(taxa).replaceAll(",", ".") + "%");
    }
}