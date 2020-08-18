package heranca1;

public class Computador extends Equipamento {
	// 1 ao 8
	
	private String marca;
	private int memoriaRAM;
	
	public Computador() {
	}
	
	public Computador(boolean ligado, int ano, String marca, int memoriaRAM) {
		super(ligado, ano);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
	}
	
	public String mostrarMarca() {
		return this.marca;
	}
	
	public int mostrarMemoriaRAM() {
		return this.memoriaRAM;
	}
	
	public void mudarMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	public void mudarMemoriaRAM(int novaMemoria) {
		this.memoriaRAM = novaMemoria;
	}
	
	public String toString() {
		return "Ligado: " + super.mostrarEstadoAtual() + "\nAno: " + super.mostrarAno() + "\nMarca: " + this.marca + "\nMemória RAM: " + this.memoriaRAM;
	}
}
