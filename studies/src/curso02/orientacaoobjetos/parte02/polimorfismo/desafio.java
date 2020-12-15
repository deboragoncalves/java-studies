package curso02.orientacaoobjetos.parte02.polimorfismo;

public class desafio {

    /*

    Desafio: Utilizar polimorfismo dinâmico.

     */

    public static void main(String[] args) {

        // Produto e mesa

        Product product = new Product();
        product.setName("Mesa");
        product.setPrice(20.00);

        System.out.println(product);

        Table table = new Table();
        table.setName("Mesa quadrada");
        table.setPrice(30.0);
        table.setDiscount(0.25);

        System.out.println(table);

    }
}
