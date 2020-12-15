package curso01.orientacaoobjetos.listaExercicios01.exercicio04;

public class Exercicio4 {

	public static void main(String[] args) {
		// 4	
		ControleRemoto controle = new ControleRemoto();
		
		controle.setVolume(20);
		controle.aumentarVolume();
		
		controle.setCanal(15);
		controle.diminuirCanal();
		
		System.out.println(controle);

	}

}
