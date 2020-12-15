package curso02.orientacaoobjetos.parte01.desafio02;

import java.text.DecimalFormat;

public class Product {

    private String name;
    private double price;

    public Product() {

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    public String formatPrice() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        return decimalFormat.format(this.price).replace(",", ".");
    }

    @Override
    public String toString() {
        return "Nome: " + this.getName() + "\nPreço: " + this.formatPrice();
    }
}
