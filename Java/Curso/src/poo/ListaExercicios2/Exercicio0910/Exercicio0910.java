package heranca.Exercicio0910;

public class Exercicio0910 {

	public static void main(String[] args) {
		// 09 e 10
		
		Moto moto = new Moto();
		
		moto.setMarca("Renault");
		moto.setCor("Branco");
		moto.setModelo("2014");
		moto.setMarcha(1);
		System.out.println(moto);
		
		System.out.println();
		Moto moto2 = new Moto("Toyota", "Preto", "2015", 0);
		System.out.println(moto2);



	}

}
