import java.util.Scanner;

public class MinutosParaHoras {
    public static void main(String[] args){
        int hora, minuto, totalHoras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o total da viagem em minutos:");
        minuto = sc.nextInt();
        hora = minuto / 60;
        totalHoras = minuto % 60;
        System.out.println("O total de horas foram: "+ hora + "e" + totalHoras + "minutos");
    }
}
