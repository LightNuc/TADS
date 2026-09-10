import java.util.Scanner;

public class validandoTriangulos {
    public static void main(String[] args) {
        double n1, n2, n3;
        boolean triangulo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números, veremos se ele consegue fazer um triângulo!");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1+n2){
            System.out.println("Você consegue criar um triângulo com esses números!");
        }
        else {
            System.out.println("Não é possível criar um triângulo com esses números...");
            triangulo = false;
        }
        if (triangulo){ // triangulo == true tmb funcionaria mas seria fútil lmao
            if (n1 == n2 && n2 == n3){
            System.out.println("O triângulo é Equilátero!!!");
            }
            else if (n1 == n2 || n2 == n3 || n1 == n3){
                System.out.println("O triângulo é Isosceles!!");
            }
            else{
                System.out.println("O triangulo é Escaleno...");
            }
        }
        else{
            System.out.println("Tente novamente");
        }
    }
}
