package com.debora.exercicios;

import java.text.DecimalFormat;
import java.util.Random;

public class exercicio01 {

    public static void main(String[] args) {

	// 01. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        // Aleatorio entre 0 e 100

        Random number = new Random();
        double tempC = number.nextDouble() * 100;

        // Formatar double

        DecimalFormat decimalFormat = new DecimalFormat("###.00");

        final double const1 = 5 / 9;
        final double const2 = 32;

        double tempF = (tempC - const2) * const1;

        System.out.println("Temperatura em Celsius " + decimalFormat.format(const1) + " C");
        System.out.println("Temperatura em Fahrenheit " + tempF + " F");
    }
}
