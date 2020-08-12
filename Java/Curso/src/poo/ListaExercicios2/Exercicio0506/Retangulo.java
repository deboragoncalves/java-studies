package heranca.Exercicio0506;

public class Retangulo {
	private double comprimento;
	private double largura;
	private double area;
	private double perimetro;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double novoComprimento, double novaLargura, double novaArea, double novoPerimetro) {
		this.comprimento = novoComprimento;
		this.largura = novaLargura;
		this.area = novaArea;
		this.perimetro = novoPerimetro;
	}
	
	public void setComprimento(double novoComprimento) {
		this.comprimento = novoComprimento;
	}
	
	public void setLargura(double novaLargura) {
		this.largura = novaLargura;
	}
	
	public double calcularArea() {
		this.area = this.comprimento * this.largura;
		return this.area;
	}
	
	public double calcularPerimetro() {
		this.perimetro = (2 * this.comprimento) + (2 * this.largura);
		return this.perimetro;
	}
	
	public String toString() {
		return "Comprimento: " + this.comprimento + "\nLargura: " + this.largura + "\nÁrea: " + this.area + "\nPerímetro: " + this.perimetro;
	}

}
