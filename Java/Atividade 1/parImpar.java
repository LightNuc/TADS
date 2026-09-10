import java.util.Scanner;

public class parImpar{
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número favorito");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é impar");
        }   
    }
}