import java.util.Scanner;

public class transporte {
    public static void main(String[] args){
    int opcao;
    double tempo, velocidadeM;
    double distancia = 1500;
    Scanner sc = new Scanner(System.in);
    System.out.println("Você está indo em uma viagem para o senac, que de você está mais ou menos 1500 metros de distância");
    System.out.println("Qual dos veículos deseja pegar?");
    System.out.println("1 - Carro");
    System.out.println("2 - Bicicleta");
    System.out.println("3 - Ônibus");
    System.out.println("4 - Avião");
    opcao = sc.nextInt();
    if (opcao == 1){
        System.out.println("Você escolheu o carro, você demora apenas 30 minutos para chegar");
        tempo = 30;
        velocidadeM = distancia / tempo;
        System.out.printf("A velocidade Média foi de %.2f !", velocidadeM);
    }
        else if (opcao == 2){
            System.out.println("Você escolheu a bicicleta, escolhendo a faixa exclusiva você chega em 40 minutos");
            tempo = 40;
            velocidadeM = distancia / tempo;
            System.out.printf("A velocidade Média foi de %.2f !", velocidadeM);
        }
        else if (opcao == 3){
            System.out.println("Você escolheu o Ônibus, você chega em 60 minutos");
            tempo = 60;
            velocidadeM = distancia / tempo;
            System.out.printf("A velocidade Média foi de %.2f !", velocidadeM);
        }
        else if (opcao == 4){
            System.out.println("Você escolheu o Avião. Você questiona a racionalidade desta opção, mas em compensação você chega no destino em 5 minutos!"); // well...
            tempo = 60;
            velocidadeM = distancia / tempo;
            System.out.printf("A velocidade Média foi de %.2f !", velocidadeM);
        }
        else
            System.out.println("Escolha uma das opções");        
        
    }
}
