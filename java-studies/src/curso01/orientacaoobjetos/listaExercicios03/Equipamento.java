package curso01.orientacaoobjetos.listaExercicios03;

public class Equipamento {
	// 1 ao 8
	
	private boolean ligado;
	private int ano;
	
	public Equipamento() {
	}
	
	public Equipamento(boolean ligado, int ano) {
		this.ligado = ligado;
		this.ano = ano;
	}

	public boolean mostrarEstadoAtual() {
		return this.ligado;
	}
	
	public void mudarEstadoAtual(boolean novoEstadoAtual) {
		this.ligado = novoEstadoAtual;
	}
	
	public int mostrarAno() {
		return this.ano;
	}
	
	public void mudarAno(int novoAno) {
		this.ano = novoAno;
	}
	
	public String toString() {
		return "Ligado: " + this.ligado + "\nAno: " + this.ano;
	}
}
