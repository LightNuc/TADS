import java.util.Scanner;

public class crescenteTres {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números diferentes");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if (n1 < n2 && n2 < n3){
            System.out.println(n1 + "," + n2 + "," + n3);
        }
        else if (n1 < n3 && n3 < n2) {
            System.out.println(n1 + "," + n3 + "," + n2);
        }
        else if (n2 < n1 && n1 < n3) {
            System.out.println(n2 + "," + n1 + "," + n3);
        }
        else if (n2 < n3 && n3 < n1) {
            System.out.println(n2 + "," + n3 + "," + n1);
        }
        else if (n3 < n1 && n3 < n2) {
            System.out.println(n3 + "," + n1 + "," + n2);
        }
        else{
            System.out.println(n3 + "," + n2 + "," + n1);
        }
    }
}
