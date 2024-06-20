import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius;
        int fahrenheit;
        System.out.println("Insira a temperatura em Celsius:");
        celsius = scan.nextDouble();
        fahrenheit = (int) ((celsius*1.8)+32);
        System.out.println("A temperatura em Fahrenheit é "+fahrenheit);



    }
}
