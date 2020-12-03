package com.debora.exercicios.orientacaoobjetos.parte02.composicao;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class desafio01 {

    /*

    Desafio 01: Criar classes: cliente, compra, item, produto.
    Na classe compra e cliente, obter valor total.

     */

    public static void main(String[] args) {

        // Produto 1: dados e preço

        Product2 product = new Product2();
        product.setName("Caneta");
        product.setPrice(2.35);

        // Item 1: quantidade e produto

        Item item1 = new Item();

        item1.setQuantity(4);
        item1.setProduct(product);

        ArrayList<Item> items1 = new ArrayList<>();
        items1.add(item1);

        // Compra. Lista de itens

        Buy buy = new Buy();
        buy.setItems(items1);

        System.out.printf("Valor total da compra com o código %s: R$ %s", buy.getId(), buy.getTotalValue());

        // Produto 2

        Product2 product2 = new Product2();
        product2.setName("Caderno");
        product2.setPrice(10.35);

        Item item2 = new Item();

        item2.setQuantity(2);
        item2.setProduct(product2);

        ArrayList<Item> items2 = new ArrayList<>();
        items2.add(item2);

        Buy buy2 = new Buy();

        buy2.setItems(items2);

        System.out.printf("\nValor total da compra com o código %s: R$ %s", buy2.getId(), buy2.getTotalValue());

        // Cliente. Lista de compras

        ArrayList<Buy> buys = new ArrayList<>();
        buys.add(buy);
        buys.add(buy2);

        Client c1 = new Client();
        c1.setName("João");
        c1.setBuys(buys);

        System.out.printf("\nValor total das compras do cliente %s: R$ %s", c1.getName(), c1.getTotalValue());

    }
}
