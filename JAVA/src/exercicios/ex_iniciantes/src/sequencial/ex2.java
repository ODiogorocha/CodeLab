package exercicios.ex_iniciantes.src.sequencial;
import java.util.Scanner;
import java.lang.Math;
public class ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double entrada = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(entrada, 2);

        System.out.println("A = " + area);
        scanner.close();
    }
}
