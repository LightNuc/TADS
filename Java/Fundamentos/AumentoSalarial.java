import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        double salario, aumento, novoSalario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do seu salário?");
        salario = sc.nextDouble();
        aumento = salario * 0.15;
        novoSalario = salario + aumento;
        System.out.println("Você recebeu um aumento de 15% do seu atual salário de R$:" + salario + "totalizando um novo salário de R$:" + novoSalario + "Parabens!");
    }
}
