package com.debora.exercicios.orientacaoobjetos.parte02.composicao;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class desafio01 {

    /*

    Desafio 01: Criar classes: cliente, compra, item, produto. Na classe compra e cliente, obter valor total.

     */

    public static void main(String[] args) {

        // Produtos e quantidade

        Product2 product = new Product2();
        product.setName("Caneta");
        product.setPrice(2.35);

        Item item = new Item();

        item.setQuantity(4);
        item.setProduct(product);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item);

        // Total compra

        Buy buy = new Buy();
        buy.setItems(items);

        System.out.printf("Valor total da compra: R$ %s", buy.getTotalValue());

        // Produto 2

        Product2 product2 = new Product2();
        product2.setName("Caderno");
        product2.setPrice(10.35);

        Item item2 = new Item();

        item2.setQuantity(2);
        item2.setProduct(product2);

        items.clear();
        items.add(item2);

        Buy buy2 = new Buy();
        buy2.setItems(items);

        System.out.printf("Valor total da compra: R$ %s", buy2.getTotalValue());

        // Total cliente

        ArrayList<Buy> buys = new ArrayList<>();
        buys.add(buy);
        buys.add(buy2);

        Client c1 = new Client();
        c1.setBuys(buys);
        System.out.printf("Valor total do cliente: R$ %s", c1.getTotalValue());

    }
}
