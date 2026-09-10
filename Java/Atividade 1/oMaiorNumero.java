import java.util.Scanner;

public class oMaiorNumero {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números diferentes");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println(numero1 + " É o maior do que " + numero2);
        }
        else if (numero1==numero2){
            System.out.println("Os números precisam ser diferentes!");
        }
        else {
            System.out.println(numero2 + " É o maior do que " + numero1);
        }
    }
}
