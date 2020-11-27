package heranca.Exercicio0708;

public class Circulo {
	private double raio;
	private double area;
	private double perimetro;
	
	public Circulo() {
		
	}
	
	public Circulo(double novoRaio, double novaArea, double novoPerimetro) {
		this.raio = novoRaio;
		this.area = novaArea;
		this.perimetro = novoPerimetro;
	}
	
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double calcularArea() {
		this.area = 3.141516 * Math.pow(this.raio, 2);
		String.format("%.2f", this.area);
		return this.area;
	}
	
	public double calcularPerimetro() {
		this.perimetro = 3.141516 * 2 * this.raio;
		return this.perimetro;
	}
	
	public String toString() {
		return "Raio: " + this.raio + "\nÁrea: " + String.format("%.2f", this.area) + "\nPerímetro: " + String.format("%.2f", this.perimetro);
	}
}
