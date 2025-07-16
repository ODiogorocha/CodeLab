package exercicios.ex_iniciantes.src.loop_while;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cordenada X: ");
        int cordenada_x = sc.nextInt();
        System.out.println("Digite a cordenada Y: ");
        int cordenada_y = sc.nextInt();

        while(true){
            if(cordenada_x > 0 && cordenada_y > 0){
            System.out.println("Primeiro");
            }else if(cordenada_x < 0 && cordenada_y > 0){
                System.out.println("Segundo");
            }else if(cordenada_x < 0 && cordenada_y < 0){
                System.out.println("Terceiro");
            }else if(cordenada_x > 0 && cordenada_y < 0){
                System.out.println("Quarto");
            }else{
                break;
            }
            cordenada_x = sc.nextInt();
            cordenada_y = sc.nextInt();
        }

        sc.close();
    }
}
