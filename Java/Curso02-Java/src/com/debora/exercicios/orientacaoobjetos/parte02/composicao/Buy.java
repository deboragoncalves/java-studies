package com.debora.exercicios.orientacaoobjetos.parte02.composicao;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Buy {

    // TO DO: Data compra

    private long id;
    private ArrayList<Item> items = new ArrayList<>();

    public Buy() {
        this.id = Math.round(Math.random() * 20);
    }

    public Buy(ArrayList<Item> items) {
        this.id = Math.round(Math.random() * 20);
        this.items = items;
    }

    public long getId() {
        return this.id;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // TO DO: Adicionar itens

    public String getTotalValue() {

        double total = 0.0;

        for (Item item: items) {

            double price = item.getProduct().getPrice();
            int quantity = item.getQuantity();

            total += price * quantity;

        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        return decimalFormat.format(total).replace(",", ".");

    }

    @Override
    public String toString() {
        return "Código: " + this.getId() + "\nLista de Items: " + this.getItems();
    }
}
