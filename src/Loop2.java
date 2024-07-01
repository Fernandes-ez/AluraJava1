import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0, media = 0;
        int total_de_notas = 0;

        while (nota != -1) {
            System.out.println("Digite a sua nota para esse filme ou -1 para sair");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                total_de_notas++;
            }
        }
        System.out.println("Media das notas: " + media / total_de_notas);
    }
}