package exercicios.ex_iniciantes.src.condicional;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        }else{
            System.out.println("O número " + numero + " é ímpar.");
        }
        sc.close();
    }
}
