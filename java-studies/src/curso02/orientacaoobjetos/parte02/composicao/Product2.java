package curso02.orientacaoobjetos.parte02.composicao;

import com.debora.exercicios.orientacaoobjetos.parte01.desafio02.Product;

import java.util.ArrayList;

public class Product2 {

    private long id;
    private String name;
    private double price;

    // Id em todos os construtores

    public Product2() {
        this.id = Math.round(Math.random() * (20));
    }

    public Product2(String name, double price) {
        this.id = Math.round(Math.random() * 20);
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // TO DO: Adicionar produtos

    @Override
    public String toString() {
        return "Código: " + this.getId() + "\nNome: " + this.getName() + "\nPreço: " + this.getPrice();
    }
}
