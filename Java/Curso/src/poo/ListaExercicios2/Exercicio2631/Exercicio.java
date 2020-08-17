package heranca.Exercicio2631;

public class Exercicio {

	public static void main(String[] args) {
		// 26 a 31
		
		Microondas microondas = new Microondas();
		System.out.println(microondas);
		
		Microondas microondas2 = new Microondas(true);
		System.out.println(microondas2);
		
		System.out.println();
		microondas2.ligar();
		System.out.println(microondas2);
		
		System.out.println();
		microondas2.desligar();
		System.out.println(microondas2);
		
		System.out.println();
		microondas2.abrirPorta();
		System.out.println(microondas2);
		
		System.out.println();
		microondas2.fecharPorta();
		System.out.println(microondas2);
	}

}
