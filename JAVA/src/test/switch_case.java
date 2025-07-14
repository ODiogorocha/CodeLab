package test;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int dia;
        String dia_resposta;

        System.out.println("Digite o dia da semana: ");
        dia = scanner.nextInt();

        switch (dia) {
            case 1:
                dia_resposta = "domingo";
                break;
            
            case 2:
                dia_resposta = "segunda";
                break;
            case 3:
                dia_resposta = "terça";
                break;
            case 4:
                dia_resposta = "quarta";
                break;
            case 5:
                dia_resposta = "quinta";
                break;
            case 6:
                dia_resposta = "sexta";
                break;
            case 7:
                dia_resposta = "sabado";
                break;
            default:
                dia_resposta = "valor invalido";
                break;
        }
        System.out.printf("%s", dia_resposta);

        scanner.close();
    }
}
