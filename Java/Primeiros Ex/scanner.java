import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome");
        String nome = sc.nextLine();
        System.out.println("Ola " + nome +"!");
    }
    
}
