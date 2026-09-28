
import java.util.Scanner;
// Heitor Sousa da Silva
//Guilherme Ferreira di mario
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1, var2, var3, var4, var5, var6, var7;
        System.out.println("Introdução");
        var1=sc.nextInt();
        System.out.println("Pergunta");
        if{
            System.out.println("Coisa 1");
            var2=sc.nextInt();
        } else {
            System.out.println("Coisa 2");
            var3=sc.nextInt();
            System.out.println("Resultado alternativo");            
        }
        System.out.println("Resultado do if else");
        System.out.println("Coisa 3");
        var4=sc.nextInt();
        if (var4 == 1){
            System.out.println("É real?");
            var5=sc.nextInt();
        } else {
            System.out.println("É real?");
            var6=sc.nextInt();
        }
        System.out.println("Coisa 4?");
        var7=sc.nextInt(); 
        System.out.println("Resultado");
        if (var7 == 2){
            System.out.println("Falso");
        }       
    }

}
