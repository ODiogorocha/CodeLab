package exercicios.ex_iniciantes.src.condicional;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.print("Digite a hora inicial do jogo: ");
        int hora_inicial = sc.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int hora_final = sc.nextInt();  

        int duracao = hora_final - hora_inicial;
        if (duracao <= 0) {
            duracao += 24; 
    }else{
            duracao = hora_final - hora_inicial;
        }

        System.err.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
