import java.util.Scanner;

public class DobroTriploRaizQuadrada {
    public static void main(String[] args){
        int numero, dobro, triplo, raiz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número favorito (que seja inteiro):");
        numero = sc.nextInt();
        dobro = numero * 2;
        triplo = numero * 3;
        raiz = (int) Math.sqrt(numero);
        System.out.println("Dobrado seu número é: "+ dobro);
        System.out.println("Triplicado seu número é " + triplo);
        System.out.println("A raiz quadrada do seu número é: " + raiz);
    }
}
