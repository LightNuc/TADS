import java.util.Scanner;

public class Ex4 {
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
            //operador ternário (condição, resultado true, resultado false).
            System.out.println(media >= 6 ? "Aprovado":"Reprovado");
        }
    }
}