import java.util.Scanner;

public class QuocienteEResto {
    public static void main(String[] args){
        int numero1, numero2, quociente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para calcular o quociente:");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        quociente = numero1 / numero2;
        System.out.println("O resultado da divisão é " + numero1 / numero2 + "E o quociente inteiro é:" + quociente);
    }
}
