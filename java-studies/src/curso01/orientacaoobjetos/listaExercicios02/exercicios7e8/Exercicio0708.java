package curso01.orientacaoobjetos.listaExercicios02.exercicios7e8;

public class Exercicio0708 {

	public static void main(String[] args) {
		// 07 e 08
		
		Circulo circulo = new Circulo();
		
		circulo.setRaio(10.0);
		circulo.calcularArea();
		circulo.calcularPerimetro();
		System.out.println(circulo);

		System.out.println();
		Circulo circulo2 = new Circulo(5.00, 78.50, 31.4);
		System.out.println(circulo2);
	}

}
