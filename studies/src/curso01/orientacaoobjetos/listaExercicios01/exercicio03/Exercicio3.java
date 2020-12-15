package curso01.orientacaoobjetos.listaExercicios01.exercicio03;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3
		
		Elevador elevador = new Elevador();
		
		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Total de andares: " + elevador.getTotalAndares());
		System.out.println("Capacidade: " + elevador.getCapacidade() + " pessoas.");
		System.out.println("Quantidade: " + elevador.getQuantidade() + " pessoas.");
		
		elevador.setAndarAtual(5);
		System.out.println("Andar atual: " + elevador.getAndarAtual());
		elevador.sobe();
		System.out.println("Andar atual: " + elevador.getAndarAtual());
		elevador.desce();
		System.out.println("Andar atual: " + elevador.getAndarAtual());
		elevador.setAndarAtual(20);
		elevador.sobe();
		System.out.println("Andar atual: " + elevador.getAndarAtual());
		elevador.setAndarAtual(0);
		elevador.desce();
		System.out.println("Andar atual: " + elevador.getAndarAtual());
		
		elevador.inicializa(0, 0);
		elevador.setCapacidadeElevador(10);
		System.out.println("Capacidade: " + elevador.getCapacidade());
		elevador.setQuantidadePessoas(10);
		elevador.entra(1);
		elevador.setQuantidadePessoas(0);
		elevador.sai(1);
		elevador.setQuantidadePessoas(10);
		elevador.sai(5);
	}

}
