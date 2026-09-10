import java.util.Scanner;

public class VelocidadeMediaViagem {
    public static void main(String[] args){
        int velocidade, tempo, distancia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância (em metros):");
        distancia = sc.nextInt();
        System.out.println("Digite o tempo (em segundos):");
        tempo = sc.nextInt();
        velocidade = distancia / tempo;
        System.out.println("Velocidade média da viagem de: " +distancia + "m/s");
    }
}
