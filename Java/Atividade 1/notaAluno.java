import java.util.Scanner;

public class notaAluno{
    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi a sua nota?");
        nota = sc.nextDouble();
        if (nota >= 7)
            System.out.println("Você foi aprovado, Parabéns!");
        else
            System.out.println("Reprovado! Mais sorte na próxima vez.");
    }
}