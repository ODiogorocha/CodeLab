package exercicios.ex_iniciantes.src.loop_for;
import java.util.Scanner;
public class ex2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: ");
        int numero = scanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < numero; i++) {
            int X = scanner.nextInt();
            if (X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
