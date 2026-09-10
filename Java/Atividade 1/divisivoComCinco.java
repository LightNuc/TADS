import java.util.Scanner;

public class divisivoComCinco {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número favorito e veja se ele é divisivo por cinco");
        numero = sc.nextInt();
        if (numero == 5){
            System.out.println("Quem diria, né?");
        }
        else if (numero % 5 == 0) {
            System.out.println(numero + " pode ser multiplicado por 5!");
        }
        else {
            System.out.println("Não pode ser multiplicado por 5!");
        }   
    }
}
