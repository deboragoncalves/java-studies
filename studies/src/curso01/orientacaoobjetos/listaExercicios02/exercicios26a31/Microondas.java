package curso01.orientacaoobjetos.listaExercicios02.exercicios26a31;

public class Microondas {
	// 26 a 31
	
	private boolean ligado = false;
	private boolean portaFechada;
	
	public Microondas() {
		
	}
	
	public Microondas(boolean estadoAtual) {
		this.ligado = estadoAtual;
	}
	
	public void ligar() {
		if (this.portaFechada == true) {
			this.ligado = true;
		} else {
			return;
		}
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void fecharPorta() {
		this.portaFechada = true;
	}
	
	public void abrirPorta() {
		this.portaFechada = false;
	}
	
	public String toString() {
		return "Ligado: " + this.ligado + "\nPorta fechada: " + this.portaFechada;
	}
}
