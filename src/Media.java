import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2, media;
        int mediaArredondada;
        System.out.println("Insira a primeira e segunda nota:");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        media=(n1+n2)/2;
        mediaArredondada = (int) media;
        System.out.println("Sua média é "+media+"\n Arredondando ficará:"+mediaArredondada);

    }
}
