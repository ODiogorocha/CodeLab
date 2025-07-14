package exercicios.ex_iniciantes.src.sequencial;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id_funcionario = sc.nextInt();
        int horas_trabalhadas = sc.nextInt();
        double valor_hora = sc.nextDouble();

        double saraio = valor_hora * horas_trabalhadas;

        System.out.println("NUMBER = " + id_funcionario);
        System.out.println("SALARY = R$ " + saraio);
        sc.close();
    }
}
