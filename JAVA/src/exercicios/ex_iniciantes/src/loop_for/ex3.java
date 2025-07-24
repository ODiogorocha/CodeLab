import java.util.Scanner;

package loop_for;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double media = (a * 2 + b * 3 + c * 5) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}