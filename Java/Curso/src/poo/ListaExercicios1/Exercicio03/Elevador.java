package poo;

public class Elevador {
	private int andarAtual = 0;
	private int totalAndares = 20;
	private int capacidade = 8;
	private int quantidadePessoas = 0;

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getQuantidade() {
		return quantidadePessoas;
	}

	public void setAndarAtual(int andar) {
		this.andarAtual = andar;
	}

	public void setTotalAndares(int numeroAndares) {
		this.totalAndares = numeroAndares;
	}

	public void setCapacidadeElevador(int capacidade) {
		this.capacidade = capacidade;
	}

	public void setQuantidadePessoas(int numeroPessoas) {
		this.quantidadePessoas = numeroPessoas;
	}

	public void inicializa(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		System.out.println("Início - Capacidade: " + capacidade + ", Total de Andares: " + totalAndares);
	}

	public void entra(int entrada) {

		if (this.quantidadePessoas < this.getCapacidade()) {
			this.quantidadePessoas += entrada;
			System.out.println("Quantidade de pessoas: " + this.quantidadePessoas);
		} else {
			System.out.println("O elevador está em sua capacidade máxima.");
		}

	}

	public void sai(int saida) {
		if (this.quantidadePessoas > 0) {
			this.quantidadePessoas -= saida;
			System.out.println("Quantidade de pessoas: " + this.quantidadePessoas);
		} else {
			System.out.println("O elevador está vazio.");
		}
	}

	public void sobe() {
		if (andarAtual == totalAndares) {
			System.out.println("O elevador está no último andar.");
		} else {
			andarAtual += 1;
		}
	}

	public void desce() {
		if (andarAtual == 0) {
			System.out.println("O elevador está no primeiro andar.");
		} else {
			andarAtual -= 1;
		}
	}

}
