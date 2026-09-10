import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        int peso, altura, IMC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu peso e sua altura (nessa ordem) para checarmos seu IMC");
        peso = sc.nextInt();
        altura = sc.nextInt();
        IMC = peso / (altura*2);
        if (IMC < 18.5)
            System.out.println("Você é abaixo do peso (<18.5)");
        else if (IMC < 24.9)
            System.out.println("Seu IMC é normal (18.5 a 24.9)");
        else if (IMC < 29.9)
            System.out.println("Você está com sobrepeso");
        else
            System.out.println("Você é obeso!!");
    }
}
