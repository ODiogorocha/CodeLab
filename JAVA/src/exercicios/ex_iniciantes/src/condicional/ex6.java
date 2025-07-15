package exercicios.ex_iniciantes.src.condicional;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        String intervalo;

        if(valor >= 0 && valor <= 25.00){
            intervalo = "Intervalo [0,25]";
        }else if(valor <= 50.00){
            intervalo = "Intervalo [25,50]";
        }else if(valor <= 75){
            intervalo = "Intervalo [50,75]";
        }else if(valor <= 100){
            intervalo = "Intervalo [75,100]";
        }else{
            intervalo = "Fora de intervalo";
        }

        System.out.println(intervalo);
        sc.close();
    }

}
