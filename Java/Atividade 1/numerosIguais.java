import java.util.Scanner;

public class numerosIguais {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números, o computador vai checar se o terceiro número é igual o primeiro ou segundo.");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if (n3 == n1 || (n3 == n2))
            System.out.println("É igual");
        else
            System.out.println("Todos os números são diferentes");
    }
}
