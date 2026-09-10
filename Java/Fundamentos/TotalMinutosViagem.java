import java.util.Scanner;

public class TotalMinutosViagem {
    public static void main(String[] args){
        int horas, minutos, totalMinutos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva separadamente quantas horas e quantos minutos durou a sua viagem:");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        totalMinutos = (horas * 60) + minutos;
        System.out.println("Em minutos, sua viagem durou um total de: " + totalMinutos + " minutos. Esperamos que tenha tirado o máximo de proveito!!!");
    }
}
