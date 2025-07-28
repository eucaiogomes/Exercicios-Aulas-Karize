import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatua em graus Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.print("Convertendo em graus Fahrenheit: ");
        celsius = (celsius * 9/5) + 32;

        System.out.printf("temperatura em graus fahrenheit : %.2f%n", celsius);
    }
}