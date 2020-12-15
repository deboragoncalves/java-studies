package curso01.orientacaoobjetos.listaExercicios02.exercicio17a19;

public class Eletrodomestico {
	// 17 a 19
	
	private boolean ligado = false;
	
	public Eletrodomestico() {
		
	}
	
	public Eletrodomestico(boolean estadoAtual) {
		this.ligado = estadoAtual;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public String toString() {
		return "Ligado: " + this.ligado;
	}
}
