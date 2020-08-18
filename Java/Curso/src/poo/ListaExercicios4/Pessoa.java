package sobrecarga;

public class Pessoa {
	private int codigo;
	private int idade;
	private String nome;
	
	public Pessoa() {
		System.out.println("Construtor padrão");
	}
	
	public Pessoa(int codigo, int idade, String nome) {
		this.codigo = codigo;
		this.idade = idade;
		this.nome = nome;
	}
	
	public int mostrarCodigo() {
		return this.codigo;
	}
	
	public int mostrarIdade() {
		return this.idade;
	}
	
	public String mostrarNome() {
		return this.nome;
	}
	
	public void mudarCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void mudarIdade(int idade) {
		this.idade = idade;
	}
	
	public void mudarNome(String nome) {
		this.nome = nome;
	}
	
	public String exibe() {
		return "Código: " + this.codigo + "\nIdade: " + this.idade + "\nNome: " + this.nome;
	}
	
	public String exibe(int idade) {
		if (idade == 1) {
			return "Código: " + this.codigo + "\nIdade: " + this.idade + "\nNome: " + this.nome;
		} else {
			return "Código: " + this.codigo + "\nNome: " + this.nome;
		}
	}
}
