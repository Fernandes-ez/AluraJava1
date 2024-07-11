import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, chute, i = 1;
        numero=new Random().nextInt(100);
        System.out.println("Escolha um numero entre 0 e 100");
        chute=scan.nextInt();
        while (i <= 4){

            if (numero == chute){
                System.out.println("Você acertou!");
                break;
            }else {
                System.out.println("Tente novamente");
                chute=scan.nextInt();
            }
            i++;
        }
    }
}
