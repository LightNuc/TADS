import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {
        int ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um ano e vamos ver se ele é um ano bissexto.");
        ano = sc.nextInt();
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
            System.out.println(ano + " É bissexto");
        else
            System.out.println(ano + " Não é bissesxto");
    }
}
