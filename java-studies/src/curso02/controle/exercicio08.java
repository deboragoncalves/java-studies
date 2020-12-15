package curso02.controle;

import javax.swing.*;
import java.util.Random;

public class exercicio08 {

    public static void main(String[] args) {

        /*

        8. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        Armazene um numero aleatório em uma variável.
        O Jogador tem 10 tentativas para adivinhar o número gerado.
        Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
        e imprima se o número inserido é maior ou menor do que o número armazenado.

         */

        // Aleatorio entre 0 e 10

        Random numberRandom = new Random();
        int anyNumber = numberRandom.nextInt(11);

        for (int i = 10; i >= 1; i--) {

            String inputNumber = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
            int number = Integer.parseInt(inputNumber);

            if (number == anyNumber) {
                System.out.printf("Número digitado pelo usuário: %d \n", number);
                System.out.printf("Número aleatório: %d \n", anyNumber);
                System.out.println("Parabéns. Você acertou!");
                break;
            }

            System.out.printf("Você possui %d tentativas \n", i);
        }

    }
}
