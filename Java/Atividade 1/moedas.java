import java.util.Scanner;

public class moedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, valorConvertido;
        int moedaOriginal, moedaConvertida; 
        System.out.println("Esse é um convertor de moedas.");
        System.out.println("Insira um valor");
        valor = sc.nextDouble();
        System.out.println("Escolha uma moeda para o valor inserido:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        moedaOriginal = sc.nextInt();
        System.out.println("Qual a moeda para o valor ser convertido?");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        moedaConvertida = sc.nextInt();
        if (moedaOriginal == 1){ // opção escolhida (Dolar)
            if(moedaConvertida == 2){ // euro
                valorConvertido = valor / 1.16;
                System.out.printf("%.2f Euros", valorConvertido);
            }
            else if (moedaConvertida == 3) { // real
                valorConvertido = valor * 5.12; // real
                System.out.printf("%.2f Reais", valorConvertido);
            }
            else System.out.println(valor + " Reais (Quem Diria)");
        }
        else if (moedaOriginal == 2){ // opção escolhida (Euro)
            if(moedaConvertida == 1){ // dolar
                valorConvertido = valor * 1.16;
                System.out.printf("%.2f Dólares", valorConvertido); 
            }
            else if (moedaConvertida == 3) { // real
                valorConvertido = valor * 5.59; // real
                System.out.printf("%.2f Reais", valorConvertido); 
            }
            else System.out.println(valor + " Euros (Quem Diria)");
        }
        else if (moedaOriginal == 3){ // opção escolhida (Real)
            if(moedaConvertida == 1){ // dolar
                valorConvertido = valor / 5.12;
                System.out.printf("%.2f Dólares", valorConvertido); 
            }
            else if (moedaConvertida == 2) { // euro
                valorConvertido = valor / 5.59;
                System.out.printf("%.2f Euros", valorConvertido); 
            }
            else System.out.println(valor + " Reais (Quem Diria)");
        }
        else{
            System.out.println("Insira uma opção válida");
        }
    }
}
