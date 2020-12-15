package JavaFor;

public class Exercicio34 {

	public static void main(String[] args) {
		// 34
		
		int soma = 0;
		int mmc = mmc(1, 2);
		soma += mmc;
		
		System.out.println("O mmc entre 1 e 2 é " + mmc);
		
		int mmc2 = mmc(2, 3);
		soma += mmc2;
		
		System.out.println("O mmc entre 2 e 3 é " + mmc2);
		
		int mmc3 = mmc(3, 4);
		soma += mmc3;
		
		System.out.println("O mmc entre 3 e 4 é " + mmc3);
		
		int mmc4 = mmc(4, 5);
		soma += mmc4;
		
		System.out.println("O mmc entre 4 e 5 é " + mmc4);
		
		int mmc5 = mmc(5, 6);
		soma += mmc5;
		
		System.out.println("O mmc entre 4 e 5 é " + mmc5);
		
		int mmc6 = mmc(6, 7);
		soma += mmc6;
		
		System.out.println("O mmc entre 6 e 7 é " + mmc6);
		
		int mmc7 = mmc(7, 8);
		soma += mmc7;
		
		System.out.println("O mmc entre 7 e 8 é " + mmc7);
		
		int mmc8 = mmc(8, 9);
		soma += mmc8;
		
		System.out.println("O mmc entre 8 e 9 é " + mmc8);
		
		int mmc9 = mmc(9, 10);
		soma += mmc9;
		
		System.out.println("O mmc entre 9 e 10 é " + mmc9);
		
		int mmc10 = mmc(10, 11);
		soma += mmc10;
		
		System.out.println("O mmc entre 10 e 11 é " + mmc10);
		
		int mmc11 = mmc(11, 12);
		soma += mmc11;
		
		System.out.println("O mmc entre 11 e 12 é " + mmc11);
		
		int mmc12 = mmc(12, 13);
		soma += mmc12;
		
		System.out.println("O mmc entre 12 e 13 é " + mmc12);
		
		int mmc13 = mmc(13, 14);
		soma += mmc13;
		
		System.out.println("O mmc entre 13 e 14 é " + mmc13);
		
		int mmc14 = mmc(14, 15);
		soma += mmc14;
		
		System.out.println("O mmc entre 14 e 15 é " + mmc14);
		
		int mmc15 = mmc(15, 16);
		soma += mmc15;
		
		System.out.println("O mmc entre 15 e 16 é " + mmc15);
		
		int mmc16 = mmc(16, 17);
		soma += mmc16;
		
		System.out.println("O mmc entre 16 e 17 é " + mmc16);
		
		int mmc17 = mmc(17, 18);
		soma += mmc17;
		
		System.out.println("O mmc entre 17 e 18 é " + mmc17);
		
		int mmc18 = mmc(18, 19);
		soma += mmc18;
		
		System.out.println("O mmc entre 17 e 18 é " + mmc18);
		
		int mmc19 = mmc(19, 20);
		soma += mmc19;
		
		System.out.println("O mmc entre 18 e 19 é " + mmc19);
		System.out.println("A soma é " + soma);
	}
	
	public static int mmc(int n1, int n2) {
		int resto;
	      int a = n1;
	      int b = n2;
	      while (b != 0) {
	         resto = a % b;
	         a = b;
	         b = resto;
	      }

	      return (n1 * n2) / a;
	}

}
