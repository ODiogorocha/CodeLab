package exercicios.ex_iniciantes.src.loop_while;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha_correta = 2002;
        int senha = 0;

        while(senha != senha_correta){
            System.out.println("Digite a senha:");
            senha = sc.nextInt();

            if(senha != senha_correta){
                System.out.println("Senha invalida");
            }else{
                System.out.println("Acesso permitido");
            }
        }

        sc.close();    
    }
}
