import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a base do retângulo???");
        base = sc.nextDouble();
        System.out.println("Qual a altura do retângulo???");
        altura = sc.nextDouble();
        area = base * altura;
        System.out.println("A área do retângulo é:" + area);
    }
}
