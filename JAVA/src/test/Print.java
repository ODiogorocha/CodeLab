package test;
import java.util.Locale;

public class Print {
    public static void main(String[] args){
        int numero = 32;
        double numero_flutuante = 10.3532656;
        System.out.println(numero);
        System.out.printf("%.2f\n", numero_flutuante);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", numero_flutuante);

    }
}
