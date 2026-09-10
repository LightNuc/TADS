import java.util.Scanner;

public class votoObrigatorio {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos você tem??");
        idade = sc.nextInt();
        if (idade < 18)
            System.out.println("Você é muito jovem para votar");
        else if (idade >= 18 && idade < 70)
            System.out.println("Você está apto a votar");
        else
            System.out.println("Você é muito velho para votar");
    }
}