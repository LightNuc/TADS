import java.util.Scanner;

public class av1 {
    public static void main(String[] args) {
        //variaveis
        double nota1, nota2, nota3, nota4, soma;
        Scanner sc = new Scanner(System.in);
        //entrada de dados
        System.out.println("Informe o nome do aluno");
        String nome = sc.nextLine();
        System.out.println("Informe a primeira nota");
        nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota");
        nota2 = sc.nextDouble();
        System.out.println("Informe a terceira nota");
        nota3 = sc.nextDouble();
        System.out.println("Informe a quarta nota");
        nota4 = sc.nextDouble();
        //operação
        soma = (nota1 + nota2 + nota3 + nota4)/4.0;
        //saida
        System.out.println("Parabens! " + nome + " Sua média final é: " + soma);
    }
}
