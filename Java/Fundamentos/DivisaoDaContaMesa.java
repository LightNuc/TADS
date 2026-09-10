import java.util.Scanner;

public class DivisaoDaContaMesa {
    public static void main(String[] args) {
        int numeroPessoas, valorConta, valorDividido;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas estão na mesa?");
        numeroPessoas = sc.nextInt();
        System.out.println("Qual foi o valor total da conta?");
        valorConta = sc.nextInt();
        valorDividido = valorConta / numeroPessoas;
        System.out.println("Cada um deverá pagar R$ " + valorDividido);
    }
}
