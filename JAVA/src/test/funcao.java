package test;
import java.util.Scanner;

public class funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        int maiorValor = max(valor1, valor2, valor3);
        show_result(maiorValor);

        sc.close();
    }

    public static int max(int valor1, int valor2, int valor3) {
        int auxiliar;

        if(valor1 > valor2 && valor1 > valor3) {
            auxiliar = valor1;
        } else if(valor2 > valor1 && valor2 > valor3) {
            auxiliar = valor2;
        } else {
            auxiliar = valor3;
        }

        return auxiliar;
    }

    public static void show_result(int result){
        System.out.println("O maior valor é: " + result);
    }
}

