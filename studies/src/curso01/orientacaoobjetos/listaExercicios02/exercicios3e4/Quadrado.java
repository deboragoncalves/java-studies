package curso01.orientacaoobjetos.listaExercicios02.exercicios3e4;

public class Quadrado {
	private double lado;
	private double area;
	private double perimetro;
	
	public Quadrado() {
		
	}
	
	public Quadrado(double novoLado, double novaArea, double novoPerimetro) {
		this.lado = novoLado;
		this.area = novaArea;
		this.perimetro = novoPerimetro;
	}
	
	public void setLado(double novoLado) {
		this.lado = novoLado;
	}
	
	public double calcularArea() {
		this.area = 2 * this.lado;
		return this.area;
	}
	
	public double calcularPerimetro() {
		this.perimetro = 4 * this.lado;
		return this.perimetro;
	}
	
	public String toString() {
		return "Lado: " + this.lado + "\n�rea: " + this.area + "\nPer�metro: " + this.perimetro;
	}
}
