import javax.swing.JOptionPane;
public class Desafio3 {
    public static void main(String[] args){

     
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número inteiro: "));

        if(num1 > num2){
            JOptionPane.showMessageDialog(null,"O primeiro número é maior que o segundo.");  
        } else if(num1 < num2){
            JOptionPane.showMessageDialog(null,"O segundo número é maior que o primeiro.");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        }

        if(num1 % 2 == 0){
            JOptionPane.showMessageDialog(null, num1 + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, num1 + " é ímpar.");
        }

        if(num2 % 2 == 0){
            JOptionPane.showMessageDialog(null, num2 + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, num2 + " é ímpar.");
        }

        if(num1 > 0){
            JOptionPane.showMessageDialog(null, num1 + " é positivo.");
        } else if(num1 < 0){
            JOptionPane.showMessageDialog(null, num1 + " é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, num1 + " é zero.");
        }

        if(num2 > 0){
            JOptionPane.showMessageDialog(null, num2 + " é positivo.");
        } else if(num2 < 0){
            JOptionPane.showMessageDialog(null, num2 + " é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, num2 + " é zero.");
        }
    }
}
