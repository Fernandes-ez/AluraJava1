import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu ="Insira a opção desejada: \n1 - Quadrado\n2 - Circulo";
        int op;
        System.out.println(menu);
        op = scan.nextInt();
        switch (op){
            case 1:
                System.out.println("Digite o lado do quadrado:");
                double lado = scan.nextDouble();
                System.out.println("A área do quadrado é: " + lado*lado);
                break;
            case 2:
                System.out.println("Digite o raio do circulo:");
                double raio = scan.nextDouble();
                System.out.println("A área do circulo é: " + 3.14*raio*raio);
                break;
        }
    }
}
