import java.util.Scanner;

public class divisivoQuatroTres {
        public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número favorito e veja se ele é divisivo igualmente por quatro e por três");
        numero = sc.nextInt();
        if (numero % 4 == 0 && numero % 3 == 0){
            System.out.println("Seu número pode ser multiplicado por 4 e 3!");
        }
        else{
            System.out.println("Seu número não pode ser multiplicado por 4 e 3...");
        }
    }
}
