import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //variaveis
        double n1,n2, media;
        Scanner ler = new Scanner(System.in);
        //entrada
        System.out.println("Informe as notas");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        //cálculo da média
        media = (n1 + n2) / 2;
        //decidir sobre média
        if (media >= 6) {
            System.out.println( "Aprovado!");
        } 
        else {
            System.out.println("Reprovado!");
        }
    }
}
