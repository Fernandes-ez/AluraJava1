import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome="Enzo", tipoconta="corrente",menu="Insira a opção desejada\n1 - Consultar saldo\n2 - Receber Pix\n3 - Realizar Pix\n4 - Sair";
        int op=0;
        double saldo=0, pixrecebido, pixfeito;
        System.out.println("*******************************************************");
        System.out.println("Bem vindo ao Banco do Enzo");
        System.out.println(nome+"\nTipo de conta: "+tipoconta);
        System.out.println("*******************************************************");
        do {
            System.out.println("\n" + menu);
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 2:
                    System.out.println("\nQual o valor a receber?");
                    pixrecebido = scan.nextDouble();
                    saldo = saldo + pixrecebido;
                    System.out.println("Valor recebido\nSaldo atualizado: R$ " + saldo);
                    break;
                case 3:
                    System.out.println("\nQual o valor a enviar?");
                    pixfeito = scan.nextDouble();
                    if (pixfeito > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - pixfeito;
                        System.out.println("Valor enviado\nSaldo atualizado: R$" + saldo);
                    }
                    break;
                case 4:
                    break;

            }
        }while (op!=4);{
            System.out.println("\n"+menu);
        }

    }
}
