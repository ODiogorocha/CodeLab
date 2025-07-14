package test;
import java.util.Scanner;

public class enquanto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int soma = 0;
        while (numero != 0) {
            soma += numero;
            numero = scanner.nextInt();
        }
        System.out.println("SOMA = " + soma);
        scanner.close();
    }
}
