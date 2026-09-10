import java.util.Scanner;

public class oMenuDeCafe {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema altomatizado de escolha de menu.");
        System.out.println("Escolha uma das opções abaixo (coloque o número da opção)");
        System.out.println("1 - Pão com mateiga");
        System.out.println("2 - Café com leite");
        System.out.println("3 - Suco de laranja");
        System.out.println("4 - omelete");
        opcao = sc.nextInt();
        if (opcao == 1)
            System.out.println("Você escolheu o Pão com mateiga. Yum!");
        else if (opcao == 2)
            System.out.println("Você escolheu Café com Leite, ótima escolha!");
        else if (opcao == 3)
            System.out.println("Você escolheu Suco de laranja.");
        else if (opcao == 4)
            System.out.println("Você escolheu o omelete...");
        else
            System.out.println("Escolha uma opção válida");
    }
}
