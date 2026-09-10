import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args){
        int numero, numeroAFrente, numeroAtras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número favorito (que seja inteiro):");
        numero = sc.nextInt();
        numeroAFrente = numero + 1;
        numeroAtras = numero - 1;
        System.out.println("Você digitou o número:"+ numero);
        System.out.println("O numero sucessor é:"+ numeroAFrente);
        System.out.println("O numero antecessor é:"+ numeroAtras);
    }
}
