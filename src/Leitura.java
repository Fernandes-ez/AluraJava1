import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual a data de lançamento?");
        int data = leitura.nextInt();
        System.out.println("Qual nota você da para o filme?");
        double nota = leitura.nextDouble();
        System.out.println("Seu filme favorito é " + filme + ", lançado em " + data + " e você deu a nota " + nota);
    }
}
