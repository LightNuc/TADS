import java.util.Scanner;

public class ConversaoDolarReal {
    public static void main(String[] args) {
        double valorDolar, valorReal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o valor que tem (em dollar)?");
        valorDolar = sc.nextDouble();
        valorReal = valorDolar * 5.20;
        System.out.println("A cotação do dolar está em R$5.20");
        System.out.println("O valor em reais é R$:" + valorReal);
    }
}
