
import java.util.Scanner;

public class av2 {
    public static void main(String[] args) {
        double celcius, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos graus está agora?");
        celcius = sc.nextDouble();
        resultado = celcius + 273.15;
        System.out.println( resultado + " Kelvin");
    }
}
