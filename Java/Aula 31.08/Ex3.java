import java.util.Scanner;

public class Ex3 {
   public static void main(String[] args) {
        //variáveis  
       double nota,frequencia;
       String resultado;
       Scanner sc = new Scanner(System.in);
       //entrada
       System.out.println("Informe a nota (0 a 10)");
       nota = sc.nextDouble();
       System.out.println("Informe a frequência (0 a 100)");
       frequencia = sc.nextDouble();
       if (frequencia < 75) {
            resultado = "Aluno reprovado!";
            //no lugar de System.out.println(""), pode colocar a String criada depois do double, como no exemplo, resultado = "".
       }
        else if (nota > 5.6) {
            resultado = "Aluno aprovado";
        }
        else if (nota >= 3) {
            resultado = "Aluno de recuperação";
        }
        else if (nota >= 2) {
            resultado = "Aluno de REA";
        }
        else {
            resultado = "Aluno reprovado!";
        }
        }
   } 