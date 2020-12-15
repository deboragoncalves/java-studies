package curso02.orientacaoobjetos.parte02.composicao;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Client {

    private long id;
    private String name;
    private ArrayList<Buy> buys = new ArrayList<>();

    public Client() {
        this.id = Math.round(Math.random() * 20);
    }

    public Client(String name, ArrayList<Buy> buys) {
        this.id = Math.round(Math.random() * 20);
        this.name = name;
        this.buys = buys;
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

    public ArrayList<Buy> getBuys() {
        return this.buys;
    }

    public void setBuys(ArrayList<Buy> buys) {
        this.buys = buys;
    }

    // TO DO: Adicionar compras

    public String getTotalValue() {

        double total = 0.0;

        for (Buy buy: buys) {

            total += Double.parseDouble(buy.getTotalValue());

        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        return decimalFormat.format(total);

    }

    @Override
    public String toString() {
        return "Código: " + this.getId() + "\nNome: " + this.getName() + "\nLista de compras: " + this.getBuys();
    }
}
