package JavaFor;

public class Exercicio50 {

	public static void main(String[] args) {
		// 50
		
		double alturaZe = 1.10;
		double alturaChico = 1.50;
		int contador = 0;
		
		do {
			
			alturaZe += 0.03;
			contador++;
			
		} while (alturaChico > alturaZe);
		
		System.out.println("Altura Z�: " + alturaZe);
		System.out.println("Altura Chico: " + alturaChico);
		System.out.println("Foram necess�rios " + contador + " anos para Z� ultrapassar Chico");
		

	}

}
