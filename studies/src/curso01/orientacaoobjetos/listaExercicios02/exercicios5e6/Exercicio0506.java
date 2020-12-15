package curso01.orientacaoobjetos.listaExercicios02.exercicios5e6;

public class Exercicio0506 {

	public static void main(String[] args) {
		// 5 e 6 
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.setComprimento(20.0);
		retangulo.setLargura(10.0);
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		System.out.println(retangulo);
		
		System.out.println();
		
		Retangulo retangulo2 = new Retangulo(30.0, 15.0, 450.0, 90.0);
		System.out.println(retangulo2);
		

	}

}
