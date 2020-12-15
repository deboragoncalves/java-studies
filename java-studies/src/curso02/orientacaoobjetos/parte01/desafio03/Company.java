package curso02.orientacaoobjetos.parte01.desafio03;

public class Company {

    /* Desafio 3: Utilizar variável estática e não constante. */

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket("João", 50.0);
        Ticket.discount = 0.25;

        System.out.println(ticket1);

    }
}
