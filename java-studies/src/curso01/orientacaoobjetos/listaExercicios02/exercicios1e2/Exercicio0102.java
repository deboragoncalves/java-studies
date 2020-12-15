package curso01.orientacaoobjetos.listaExercicios02.exercicios1e2;

public class Exercicio0102 {

	public static void main(String[] args) {
		// 01 e 02
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Bruno");
		pessoa.setEndereco("Rua X");
		pessoa.setTelefone("9999-1212");
		System.out.println(pessoa);
		
		System.out.println();
		Pessoa pessoa2 = new Pessoa("Wagner", "Rua Y", "9876-1214");
		System.out.println(pessoa2);
	}

}
