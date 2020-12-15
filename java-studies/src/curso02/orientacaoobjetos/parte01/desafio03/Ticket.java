package curso02.orientacaoobjetos.parte01.desafio03;

public class Ticket {

    private String client;
    private double price;
    static double discount;

    public Ticket() {

    }

    public Ticket(String client, double price) {
        this.client = client;
        this.price = price;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }


    public double getPrice() {
        return this.price = this.price - (this.price * discount);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getClient() + "\nPreço final: R$ " + this.getPrice() + "\nDesconto: " + Ticket.discount * 100 + "%";
    }
}
