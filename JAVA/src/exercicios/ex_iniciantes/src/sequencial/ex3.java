package exercicios.ex_iniciantes.src.sequencial;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // variaveis com apenas uma letra nao sao indicadas 
        // o certo pelo clean code seria valor_a, valor_b e etc
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diferenca = (a * b) - (c * d);
        System.out.println("DIFERENCA = " + diferenca);
        scanner.close();
    }
}
