package sobrecarga;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		System.out.println();
		pessoa.mudarNome("Sheilla");
		pessoa.mudarCodigo(2);
		pessoa.mudarIdade(21);

		System.out.println(pessoa.exibe());
		System.out.println();
		System.out.println(pessoa.exibe(1));
		System.out.println();
		System.out.println(pessoa.exibe(5));
		
		System.out.println();
		Pessoa pessoa2 = new Pessoa(1, 25, "Débora");
		System.out.println(pessoa2.exibe());
	}

}
