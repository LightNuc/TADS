import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String turma;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a sua turma");
        turma = ler.next();
        //string se compara com equals.
        if(turma.equals("A")) {
            System.out.println("Bem vindo a turma A");
        }
        else {
            System.out.println("Você não é da turma A");
        }
    }
}
