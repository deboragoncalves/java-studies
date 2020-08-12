package heranca.Exercicio0304;

public class Exercicio0304 {

	public static void main(String[] args) {
		// 03 e 04
		
		Quadrado quadrado = new Quadrado();
		
		quadrado.setLado(10.0);
		quadrado.calcularArea();
		quadrado.calcularPerimetro();
		System.out.println(quadrado);
		
		System.out.println();
		Quadrado quadrado2 = new Quadrado(15.00, 225.00, 60.00);
		System.out.println(quadrado2);
	}

}
