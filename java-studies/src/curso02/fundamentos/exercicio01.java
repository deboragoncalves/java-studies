package curso02.fundamentos;

import java.text.DecimalFormat;
import java.util.Random;

public class exercicio01 {

    public static void main(String[] args) {

	// 01. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        // Aleatorio entre 0 e 100

        Random number = new Random();
        double tempC = number.nextDouble() * 100;

        // Formatar double

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        final double const1 = 1.8;
        final double const2 = 32;

        double tempF = (tempC * const1) + const2;

        System.out.printf("Temperatura em Celsius %s C \n", decimalFormat.format(tempC));
        System.out.printf("Temperatura em Fahrenheit %s F", decimalFormat.format(tempF));
    }
}
