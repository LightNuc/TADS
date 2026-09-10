import java.util.Scanner;

public class SegundosParaHMS {
        public static void main(String[] args){
            int hora, minuto, segundo, totalSegundos;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número grande de segundos:");
            totalSegundos = sc.nextInt();
            hora = totalSegundos / 3600;
            minuto = (totalSegundos % 3600) / 60;
            segundo = (totalSegundos % 3600) % 60;
            System.out.println("Entrada: " + totalSegundos + " Saída: " + hora + "h" + minuto + "m" + segundo + "s");
    }
}
