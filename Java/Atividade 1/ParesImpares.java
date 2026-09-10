import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números, veremos se ambos são pares ou impares");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        if (numero1 % 2 == 0 && numero2 % 2 == 0)
            System.out.println("Os dois números são pares!");
        else if (numero1 != numero2)
            System.out.println("Os dois números são diferentes.");
        else
            System.out.println("Os dois números são impares!");
    }
}
