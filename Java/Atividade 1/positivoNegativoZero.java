import java.util.Scanner;

public class positivoNegativoZero {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer número (negativos também funcionam)");
        numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("Seu número é positivo");
        }
            else if (numero == 0){
                System.out.println("Seu número é zero");
            }
            else {
                System.out.println("Seu número é negativo");
        }
    }
}
