package curso02.orientacaoobjetos.parte01.desafio05;

public class Dinner {

    /*

    Desafio 06:
    Classe Pessoa: atributos nome, peso, método comer e toString()
    Classe Comida: atributos nome, peso.
    Classe Jantar: método main.

     */

    public static void main(String[] args) {

        Person person01 = new Person("João", 59.90);
        Food food01 = new Food("Bolo", 0.9);

        person01.eat(food01);

        System.out.println(person01);

    }
}
