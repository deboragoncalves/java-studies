package heranca.Exercicio0916;

public class Moto {
	private String marca;
	private String cor;
	private String modelo;
	private int marcha;
	private int menorMarcha = 0;
	private int maiorMarcha = 5;
	private boolean ligada = false;
	
	public Moto() {
		
	}
	
	public Moto(String novaMarca, String novoCor, String novoModelo, int novaMarcha) {
		this.marca = novaMarca;
		this.cor = novoCor;
		this.modelo = novoModelo;
		this.marcha = novaMarcha;
	}
	
	public Moto(String novaMarca, String novoCor, String novoModelo, int novaMarcha, int menorMarcha, int maiorMarcha) {
		this.marca = novaMarca;
		this.cor = novoCor;
		this.modelo = novoModelo;
		this.marcha = novaMarcha;
		this.menorMarcha = menorMarcha;
		this.maiorMarcha = maiorMarcha;
	}
	
	public Moto(String novaMarca, String novoCor, String novoModelo, int novaMarcha, int menorMarcha, int maiorMarcha, boolean ligada) {
		this.marca = novaMarca;
		this.cor = novoCor;
		this.modelo = novoModelo;
		this.marcha = novaMarcha;
		this.menorMarcha = menorMarcha;
		this.maiorMarcha = maiorMarcha;
		this.ligada = ligada;
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
		
		if (novaMarcha >= this.menorMarcha && novaMarcha <= this.maiorMarcha) {
			this.marcha = novaMarcha;
		} else {
			System.out.println("Não é possível mudar de marcha.");
		}
		
	}
	
	public void marchaAcima() {
		if (this.marcha < this.maiorMarcha) {
			this.marcha += 1;
		} else {
			System.out.println("Não é possível aumentar a marcha.");
		}
	}
	
	public void marchaAbaixo() {
		if (this.marcha > this.menorMarcha) {
			this.marcha -= 1;
		} else {
			System.out.println("Não é possível diminuir a marcha.");
		}
	}
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public String toString() {
		return "Marca: " + this.marca + "\nCor: " + this.cor + "\nModelo: " + this.modelo + "\nMarcha: " + this.marcha 
				+ "\nMenor marcha possível: " + this.menorMarcha + "\nMaior marcha possível: " + this.maiorMarcha + 
				"\nLigada: " + this.ligada;
	}
	
}
