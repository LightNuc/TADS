import java.util.Scanner;

public class LitrosDeTintaParaParede {
    public static void main(String[] args){
        int quantidade, altura, comprimento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura e o comprimento da parede que deseja pintar (nessa ordem):");
        altura = sc.nextInt();
        comprimento = sc.nextInt();
        quantidade = (comprimento * altura) * 2;
        System.out.println("A quantidade de tinta necessária para pintar a parede é de:" + quantidade + "litros");
    }
}
