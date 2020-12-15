package curso02.orientacaoobjetos.parte02.polimorfismo;

import java.util.Random;

public class Table extends Product {

    private int id;
    private String name;
    private double price;
    private double discount;

    Random number = new Random();

    public Table() {
        this.id = number.nextInt(26);
    }

    public Table(String name, double price, double discount) {
        this.id = number.nextInt(26);
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getDiscount() {
        return this.discount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        if (this.getDiscount() > 0.0) {
           return this.price - (this.price * this.getDiscount());
        } else {
            return this.price;
        }
    }

    @Override
    public void setPrice(double price) {
        if (this.getDiscount() > 0.0) {
            price = this.getPrice() - (this.getPrice() * this.getDiscount());
            this.price = price;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + ", Nome: " + this.getName() + ", Preço: R$ " + this.getPrice() + ", Desconto: " + this.getDiscount() * 100 + "%";
    }
}
