import java.util.Scanner;

public class HoraDaPratica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Insira um número positivo ou negativo:");
        numero=scan.nextInt();
        if (numero<0){
            System.out.println("número negativo");
        }else {
            System.out.println("número positivo");
        }
    }
}
