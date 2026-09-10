import java.util.Scanner;

public class oMaiorNumeroTres {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números diferentes");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();
        if (numero1 > numero2){
            System.out.println(numero1 + "É o maior número!");
        }
        else if (numero3>numero2){
            System.out.println(numero3 + " É o maior número!");
        }
        else if (numero1 == numero2){
            System.out.println("Insira números diferentes!");
        }
        else if (numero2 == numero3){
            System.out.println("Insira números diferentes!");
        }
        else if (numero1 == numero3){
            System.out.println("Insira números diferentes!");
        }
        else {
            System.out.println( numero2 + " É o maior número");
        }
    }
}