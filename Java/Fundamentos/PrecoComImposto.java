import java.util.Scanner;

public class PrecoComImposto {
        public static void main(String[] args){
            double preco, imposto, precoComImposto;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor do produto:");
            preco = sc.nextDouble();
            System.out.println("Qual é a taxa de imposto (em %):");
            imposto = sc.nextDouble();
            precoComImposto = preco + (preco * imposto/100);
            System.out.println("O valor do produto com o imposto é: R$" + precoComImposto);
    }
}
