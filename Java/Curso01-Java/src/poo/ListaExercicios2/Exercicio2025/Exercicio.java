package heranca.Exercicio2025;

public class Exercicio {

	public static void main(String[] args) {
		// 20 a 25
		
		Televisor televisor = new Televisor();
		System.out.println(televisor);
		
		System.out.println();
		Televisor televisor2 = new Televisor(true, 3, 5, 30, 30);
		System.out.println(televisor2);
		
		System.out.println();
		televisor2.ligar();
		System.out.println(televisor2);
		
		System.out.println();
		televisor2.desligar();
		System.out.println(televisor2);

		System.out.println();
		Televisor televisor3 = new Televisor(true, 30, 5, 30, 30);
		televisor3.canalAcima();
		System.out.println(televisor3);
		
		System.out.println();
		Televisor televisor4 = new Televisor(true, 1, 5, 30, 30);
		televisor4.canalAbaixo();
		System.out.println(televisor4);
		
		System.out.println();
		Televisor televisor5 = new Televisor(true, 1, 29, 30, 30);
		televisor5.volumeAcima();
		System.out.println(televisor5);
		
		System.out.println();
		Televisor televisor6 = new Televisor(true, 1, 1, 30, 30);
		televisor6.volumeAbaixo();
		System.out.println(televisor6);
	}

}
