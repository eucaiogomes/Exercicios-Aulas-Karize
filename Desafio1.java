import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // digitar um numero com "." ao invés de virgula.

        System.out.print("Digite a temperatura em graus Celsius: ");
        String entrada = scanner.nextLine();

        try {
            // Tenta converter a entrada para double
            double celsius = Double.parseDouble(entrada);

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Temperatura em graus Fahrenheit: %.2f%n", fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite apenas números. Use ponto para decimais (ex: 25.5).");
        }
    }
}