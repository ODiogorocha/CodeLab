package exercicios.ex_iniciantes.src.condicional;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero_a = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero_b = sc.nextInt();

        if((numero_a % numero_b) == 0 || (numero_b % numero_a) == 0){
            System.out.println("sao múltiplos");
    }else{
            System.out.println("nao sao múltiplos");
        }
        sc.close();
    }
}
