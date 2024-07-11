import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Insira um número inteiro:");
        numero=scan.nextInt();
        if (numero % 2 == 0){
            System.out.println("Esse número é par");
        }else {
            System.out.println("Esse número é ímpar");
        }
    }
}
