package test;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.next();
        int numero = scanner.nextInt();
        double numero_flutuante = scanner.nextDouble();
        char letra = scanner.next().charAt(0);
        String texto_ate_prox_linha = scanner.nextLine();

        System.out.printf("Voce digitou: %s \n", palavra);
        System.out.printf("Voce digitou: %d \n", numero);
        System.out.printf("Voce digitou: %f \n", numero_flutuante);
        System.out.printf("Voce digitou: %s\n", letra);
        System.out.printf("Voce digitou: %s\n", texto_ate_prox_linha);

        scanner.close();
    }
}
