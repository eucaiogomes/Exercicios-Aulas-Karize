import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();           
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);   

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        int par = (maior % 2 == 0) ? maior : menor;
        int impar = (maior % 2 != 0) ? maior : menor;

        System.out.println("O número par é: " + par);
        System.out.println("O número ímpar é: " + impar);
        
        if (num1 > 0) {
            System.out.println(num1 + " é positivo.");
        } else if (num1 < 0) {
            System.out.println(num1 + " é negativo.");
        } else {
            System.out.println(num1 + " é zero.");
        }

        
    }
    
}
