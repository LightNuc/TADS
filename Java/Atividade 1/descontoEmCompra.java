import java.util.Scanner;

public class descontoEmCompra {
    public static void main(String[] args) {
        double preco, desconto, precoDescontado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi o preço da sua compra??");
        preco = sc.nextDouble();
        if (preco > 500){
            desconto = preco * 0.10;
            precoDescontado = preco - desconto;
            System.out.println("Parabens! Você conseguiu um desconto de 10% na sua compra");
            System.out.println("De " + preco + " Foi para " + precoDescontado);
        }
        else if (200 < preco && preco < 500){
            desconto = preco * 0.05;
            precoDescontado = preco - desconto;
            System.out.println("Parabens! Você conseguiu um desconto de 10% na sua compra");
            System.out.println("De " + preco + " Foi para " + precoDescontado);
        }
        else 
            System.out.println("Você não conseguiu nenhum desconto em suas compras...");
    }
}
