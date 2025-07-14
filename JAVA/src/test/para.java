package test;
import java.util.Scanner;

public class para {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int condicao = scanner.nextInt();

        for(int i = 0; i < condicao; i++){
            System.out.println(condicao - i);
        }

        scanner.close();
    }
}
