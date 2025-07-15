package exercicios.ex_iniciantes.src.condicional;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double valor_x = sc.nextDouble();
        double valor_y = sc.nextDouble();

        if(valor_x == 0 && valor_y ==0){
            System.out.println("Origem");
        }else if(valor_x > 0 && valor_y > 0){
            System.out.println("Q1");
        }else if(valor_x < 0 && valor_y > 0){
            System.out.println("Q2");
        }else if(valor_x < 0 && valor_y < 0){
            System.out.println("Q3");
        }else if(valor_x > 0 && valor_y < 0){
            System.out.println("Q4");
        }
        sc.close();
    }
}
