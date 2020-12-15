package curso02.orientacaoobjetos.parte01.desafio04;

import java.text.DecimalFormat;

public class Area {

    /*

    Desafio 04: Criar variável fora do main e acessá-la dentro.

     */

    final double pi = 3.14;

    public static void main(String[] args) {

        // Opção 2: tornar variável estática.

        Area area = new Area();
        double raio = Math.random() * 100;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double result = Math.pow(area.pi, 2) * raio;

        System.out.printf("Área Circunferência: %s m²", decimalFormat.format(result));

    }
}
