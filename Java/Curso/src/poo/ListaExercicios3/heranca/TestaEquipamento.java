package heranca1;

public class TestaEquipamento {
	// 1 ao 8

	public static void main(String[] args) {
		
		Equipamento equipamento = new Equipamento();
		equipamento.mudarAno(1999);
		equipamento.mudarEstadoAtual(true);
		
		System.out.println(equipamento);
		
		System.out.println();
		Computador computador = new Computador();
		computador.mudarAno(2000);
		computador.mudarEstadoAtual(true);
		computador.mudarMarca("Dell");
		computador.mudarMemoriaRAM(8);
		System.out.println(computador);
	}

}
