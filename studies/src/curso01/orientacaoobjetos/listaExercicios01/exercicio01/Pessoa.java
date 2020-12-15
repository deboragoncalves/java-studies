package curso01.orientacaoobjetos.listaExercicios01.exercicio01;

public class Pessoa {
	// 01
	
	private String nome;
	private int idade;
	private double altura;
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nAltura: " + this.altura;
	}
	
	
}
