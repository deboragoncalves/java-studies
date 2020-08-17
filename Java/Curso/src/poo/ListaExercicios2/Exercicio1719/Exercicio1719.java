package heranca.Exercicio1719;

public class Exercicio1719 {

	public static void main(String[] args) {
		// 17 a 19
		
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		System.out.println(eletrodomestico);
		
		Eletrodomestico eletrodomestico2 = new Eletrodomestico(true);
		System.out.println(eletrodomestico2);
		
		eletrodomestico2.ligar();
		System.out.println(eletrodomestico2);
		
		eletrodomestico2.desligar();
		System.out.println(eletrodomestico2);
	}

}
