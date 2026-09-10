import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args){
        double raio, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        raio = sc.nextDouble();
        area = 3.14 * (raio * raio);
        System.out.println("A area do círculo é:" + area);
    }
}
