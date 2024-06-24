import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        int ano, classificação;
        boolean incluidoNoPlano;
        double notaDoFilme = 8.1;
        String tipoPlano;

        Scanner scan = new Scanner(System.in);
    System.out.println("Insira o ano do filme");
    ano = scan.nextInt();
        System.out.println("O filme está inclido no plano?");
        incluidoNoPlano = scan.nextBoolean();
        System.out.println("Insira o tipo do plano");
        tipoPlano = scan.next();
        if (ano>=2022){
            System.out.println("Lançamento");
        }else {
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano || tipoPlano.equals("Plano Plus")){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado");
        }

    }
}
