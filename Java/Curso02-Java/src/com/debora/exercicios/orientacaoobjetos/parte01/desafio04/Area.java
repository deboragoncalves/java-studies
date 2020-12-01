package com.debora.exercicios.orientacaoobjetos.parte01.desafio04;

import java.text.DecimalFormat;

public class Area {

    /*

    Desafio 04: Criar variável fora do main e acessá-la dentro.

     */

    final double pi = 3.14;

    public static void main(String[] args) {

        Area area = new Area();
        double raio = Math.random() * 100;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double result = Math.pow(area.pi, 2) * raio;

        System.out.printf("Área Circunferência: %s m²", decimalFormat.format(result));

    }
}
