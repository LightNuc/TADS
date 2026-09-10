import java.util.Scanner;

public class aposentar {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos você tem??");
        idade = sc.nextInt();
        if (idade >= 65)
            System.out.println("Você está apto a se aposentar!");
        else
            System.out.println("Você não está apto a se aposentar");
    }
}
