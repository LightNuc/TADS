import java.util.Scanner;

public class crescenteTresFancy {
    public static void main(String[] args) {
        int n1, n2, n3, aux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três números diferentes");

        n1 = sc.nextInt(); 
         
        
        n2 = sc.nextInt(); 
        n3 = sc.nextInt(); 

        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }               // esse código em especifico foi feito com IA, 
                        // zero fudendos totais que eu iria pensar nisso,
        if (n1 > n3) { // mas é bom manter para
            aux = n1; // futuras vezes que eu tiver que organizar 
            n1 = n3; // numerozinho via java
            n3 = aux; // Mozzer.dev
        }

        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        System.out.println(n1 + " " + n2 + " " + n3);
    }
}