package test;
import java.util.Scanner;

public class if_and_else {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int horario;

        System.out.println("Que hrs sao ? ");
        horario = scanner.nextInt();

        if(horario < 12){
            System.out.println("Bom dia !");
        }else{
            System.out.println("Boa tarde !");
        }
    }
}
