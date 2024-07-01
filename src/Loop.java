import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0, media = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Qual a nota que vpcê da pra esse filme?");
            nota = leitura.nextDouble();
            media += nota;
        }
        System.out.println("Media das notas: " + media/3);

    }
}
