import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada=1 ,numero;
        System.out.println("Insira um número inteiro para ver a tabuada:");
        numero=scan.nextInt();
        while (tabuada<=10){
            System.out.println(tabuada+"x"+numero+"="+tabuada*numero);
            tabuada++;
        }
    }
}
