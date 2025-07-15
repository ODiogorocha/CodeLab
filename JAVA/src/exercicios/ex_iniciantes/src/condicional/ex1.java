package exercicios.ex_iniciantes.src.condicional;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if(numero < 0 ){
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
