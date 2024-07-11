import java.util.Scanner;

public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Insira dois números inteiros:");
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();
        if (numero1>numero2){
            System.out.println("O primeiro número é maior");

        }
        if (numero1<numero2){
            System.out.println("O segundo número é maior");
        }
        if (numero1 == numero2) {
            System.out.println("Eles são iguais");
        }
        scan.close();
    }
}
