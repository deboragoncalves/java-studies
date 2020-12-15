package curso01.orientacaoobjetos.listaExercicios02.exercicios9a16;

public class Exercicio0916 {

	public static void main(String[] args) {
		// 09 a 16
		
		Moto moto = new Moto();
		
		moto.setMarca("Renault");
		moto.setCor("Branco");
		moto.setModelo("2014");
		moto.setMarcha(6);
		System.out.println(moto);
		
		System.out.println();
		Moto moto2 = new Moto("Toyota", "Preto", "2015", 0);
		System.out.println(moto2);
		
		System.out.println();
		moto2.setMarcha(5);
		moto2.marchaAcima();
		System.out.println(moto2);
		
		System.out.println();
		moto2.setMarcha(0);
		moto2.marchaAbaixo();
		System.out.println(moto2);
		
		System.out.println();
		Moto moto3 = new Moto("Honda", "Preto", "2016", 1, 0, 5);
		System.out.println(moto3);
		
		System.out.println();
		Moto moto4 = new Moto("Honda", "Preto", "2016", 1, 0, 5, true);
		System.out.println(moto4);
		
		System.out.println();
		moto4.desligar();
		System.out.println(moto4);
		
		System.out.println();
		moto4.ligar();
		System.out.println(moto4);
	}

}
