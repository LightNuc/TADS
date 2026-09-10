import java.util.Scanner;

public class CalculoSalarioMensal {
    public static void main(String[] args){
        double salario, horasTrabalhadas, valorHora, salarioMensal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você trabalhou este mês?");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Quanto você recebe em geral?");
        valorHora = sc.nextDouble();
        salarioMensal = horasTrabalhadas * valorHora;
        System.out.println("Parabens! Seu salário mensal será de R$" + salarioMensal + "Esperamos que esteja satisfeito pois não te daremos aumento muahahhahahahah!!!");
    }
}
