import java.util.Scanner;

public class figurasGeometricas {
    public static void main(String[] args) {
        int opcao;
        double n1, n2, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma forma geométrica:");
        System.out.println("1 - Circulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        opcao = sc.nextInt();
        if (opcao == 1){
            System.out.println("Insira a raio do circulo");
            n1 = sc.nextDouble();
            area = Math.PI * Math.pow(n1, 2);
            System.out.println("A área do círculo é: " + area);
        }
        else if (opcao == 2){
            System.out.println("Insira a medição do quadrado:");
            n1=sc.nextDouble();
            area = n1*n1;
            System.out.println("A área do quadrado é " + area);
        }
        else if (opcao == 3) {
            System.out.println("Insira as medições do Retângulo:");
            n1=sc.nextDouble();
            n2=sc.nextDouble();
            area = n1*n2;
            System.out.println("A área do Retângulo é " + area);
        }
        else {
            System.out.println("Insira operação válida");
        }
    }
}
