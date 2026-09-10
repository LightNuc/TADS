import java.util.Scanner;

public class MetrosParaCmMmKm {
    public static void main(String[] args){
        double metros, centimetros, milimetros, quilometros;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em metros que deseja converter:");
        metros = sc.nextDouble();
        centimetros = metros * 100;
        milimetros = metros * 1000;
        quilometros = metros / 1000;
        System.out.println("O valor em centimetros é: " + centimetros);
        System.out.println("O valor em milimetros é: " + milimetros);
        System.out.println("O valor em quilometros é: " + quilometros);
    }
}
