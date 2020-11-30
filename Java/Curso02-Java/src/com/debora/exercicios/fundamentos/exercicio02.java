package com.debora.exercicios.fundamentos;

import java.text.DecimalFormat;
import java.util.Random;

public class exercicio02 {

    public static void main(String[] args) {

        // 02. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

        Random number = new Random();
        double tempF = number.nextDouble() * 100;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        final double const1 = 1.8;
        final double const2 = 32;

        double tempC = (tempF - const2) / const1;

        System.out.println("Temperatura em Fahrenheit " + decimalFormat.format(tempF) + " F");
        System.out.println("Temperatura em Celsius " + decimalFormat.format(tempC) + " C");


    }
}
