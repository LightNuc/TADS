import java.util.Scanner;

public class JurosSimplesMontante {
    public static void main(String[] args) {
        double capital, taxa, tempo, montante;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as seguintes informações em ordem: capital, taxa de juros e tempo (em meses)");
        capital = sc.nextDouble();
        taxa = sc.nextDouble();
        tempo = sc.nextDouble();
        montante = capital * (1 + (taxa * tempo));
        System.out.println("O montante final é: "+ montante);
    }
}
