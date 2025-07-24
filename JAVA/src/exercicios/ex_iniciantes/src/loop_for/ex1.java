package exercicios.ex_iniciantes.src.loop_for;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        for (int i = 0; i <= valor; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
