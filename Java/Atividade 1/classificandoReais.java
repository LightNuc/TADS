import java.util.Scanner;

public class classificandoReais {
    public static void main(String[] args) {
        double numero;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número bem complexo");
        numero = sc.nextDouble();
        sc.nextLine();
        System.out.println("O número " + numero + " É:");
        if (numero >= 0) { 
            System.out.println("Positivo"); 
        } else { 
            System.out.println("Negativo"); 
        } 
            if (numero % 1 == 0) 
                { System.out.println("Inteiro"); // apenas numeros inteiros
                if (numero % 2 == 0) {              // contam como par ou impar
                    System.out.println("Par");      // Mozzer.dev
                } else { 
                    System.out.println("Ímpar"); 
            } 
        } else { 
            System.out.println("Decimal"); 
        }
    }
}