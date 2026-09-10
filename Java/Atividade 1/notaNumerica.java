import java.util.Scanner;

public class notaNumerica {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número de 0 a 10, ele será colocado entre cinco conceitos...");
        numero = sc.nextInt();
            if (numero > 10)
                System.out.println("Inválido");
            else if (numero >= 9)
                System.out.println("Seu número é igual ou maior que 9 (A)");
            else if (numero >= 8)
                System.out.println("Seu número é igual ou maior que 8 (B)");
            else if (numero >= 7)
                System.out.println("Seu número é igual ou maior que 7 (C)");
            else if (numero >= 6)
                System.out.println("Seu número é igual ou maior que 6 (D)");
            else
                System.out.println("Seu número é menor que 6 (E)");
    }
}
