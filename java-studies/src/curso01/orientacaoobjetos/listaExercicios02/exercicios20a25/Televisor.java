package curso01.orientacaoobjetos.listaExercicios02.exercicios20a25;

public class Televisor {
	// 20 a 25

	private boolean ligado = false;
	private int canal = 0;
	private int volume = 0;
	private int numeroCanais = 30;
	private int volumeMaximo = 30;
	
	public Televisor() {
		
	}
	
	public Televisor(boolean estadoAtual, int canalAtual, int volumeAtual, int volumeMaximo, int numeroCanais) {
		this.ligado = estadoAtual;
		this.canal = canalAtual;
		this.volume = volumeAtual;
		this.numeroCanais = numeroCanais;
		this.volumeMaximo = volumeMaximo;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void canalAcima() {
		if (this.canal < this.numeroCanais) {
			this.canal += 1;
		} else {
			this.canal = 1;
		}
	}
	
	public void canalAbaixo() {
		if (this.canal < this.numeroCanais) {
			if (this.canal <= 1) {
				this.canal = this.numeroCanais;
			} else {
				this.canal -= 1;
			}
		}
	}
	
	public void volumeAcima() {
		if (this.volume < this.volumeMaximo) {
			if (this.volume == this.volumeMaximo) {
				return;
			}
			
			this.volume += 1;
		} 
	}
	
	public void volumeAbaixo() {
		if (this.volume < this.volumeMaximo) {
			if (this.volume <= 0) {
				return;
			}
			this.volume -= 1;
		} 
	}
	
	public String toString() {
		return "Ligado: " + this.ligado + "\nCanal: " + this.canal + "\nVolume: " + this.volume
				+ "\nVolume m�ximo: " + this.volumeMaximo + "\nN�mero m�ximo de canais: " + this.numeroCanais;
	}
}
