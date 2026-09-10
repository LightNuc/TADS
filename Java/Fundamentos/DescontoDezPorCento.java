import java.util.Scanner;

public class DescontoDezPorCento {
    public static void main(String[] args) {
        double preco, precoDesconto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi o valor do produto?");
        preco = sc.nextDouble();
        precoDesconto = preco - (preco * 0.10);
        System.out.println("Você conseguiu um descondo de 10% totalizando um valor de R$:" + precoDesconto);
    }
}
