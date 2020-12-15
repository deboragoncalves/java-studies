package curso01.orientacaoobjetos.listaExercicios01.exercicio04;

public class ControleRemoto {
	private int volume;
	private int canal;
	
	public int getVolume() {
		return volume;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setVolume(int novoVolume) {
		this.volume = novoVolume;
	}
	
	public void setCanal(int novoCanal) {
		this.canal = novoCanal;
	}
	
	public int aumentarVolume() {
		return volume += 1;
	}
	
	public int diminuirVolume() {
		return volume -= 1;
	}
	
	public int aumentarCanal() {
		return canal += 1;
	}
	
	public int diminuirCanal() {
		return canal -= 1;
	}
	
	public String toString() {
		return "Canal: " + this.canal + "\nVolume: " + this.volume;
	}
}
