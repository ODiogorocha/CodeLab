package exercicios;
import java.util.Locale;

public class ex_fix_1 {
    public static void main(String[] args){
        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;

        String gender = "F";

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products:");
        System.out.printf("%s , wich price is $ %.2f \n", product1, price1);
        System.out.printf("%s, wich price is $ %.2f \n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s \n", age, code, gender);

        System.out.printf("Measue with eigth decimal places: %.8f \n", measure);
        System.out.printf("Rouded (three decimal places): %.3f \n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f \n",measure);

    }
}
