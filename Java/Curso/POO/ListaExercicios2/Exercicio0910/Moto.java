package heranca.Exercicio0910;

public class Moto {
	private String marca;
	private String cor;
	private String modelo;
	private int marcha;
	
	public Moto() {
		
	}
	
	public Moto(String novaMarca, String novoCor, String novoModelo, int novaMarcha) {
		this.marca = novaMarca;
		this.cor = novoCor;
		this.modelo = novoModelo;
		this.marcha = novaMarcha;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public void setMarcha(int novaMarcha) {
		this.marcha = novaMarcha;
	}
	
	public String toString() {
		return "Marca: " + this.marca + "\nCor: " + this.cor + "\nModelo: " + this.modelo + "\nMarcha: " + this.marcha;
	}
	
}
