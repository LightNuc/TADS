import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        int idade, idadeDias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sua idade em anos será convertida para dias!");
        System.out.println("Vamos inserir sua idade em anos primeiramente:");
        idade = sc.nextInt();
        idadeDias = idade * 365;
        System.out.println("Sua idade em dias é: " + idadeDias + "Uau!");
    }
}
