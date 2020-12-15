package curso02.orientacaoobjetos.parte02.composicao;

public class Item {

    private long id;
    private int quantity;
    private Product2 product = new Product2();

    public Item() {
        this.id = Math.round(Math.random() * 20);
    }

    // TO DO: Produto inválido

    public Item(int quantity, Product2 product) {
        this.id = Math.round(Math.random() * 20);
        this.quantity = quantity;
        this.product = product;
    }

    public long getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product2 getProduct() {
        return this.product;
    }

    public void setProduct(Product2 product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Código: " + this.getId() + "\nQuantidade: " + this.getQuantity() + "\nProduto: " + this.getProduct();
    }
}
