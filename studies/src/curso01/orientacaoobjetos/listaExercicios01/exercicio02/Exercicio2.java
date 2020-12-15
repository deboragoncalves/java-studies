package curso01.orientacaoobjetos.listaExercicios01.exercicio02;

import curso01.orientacaoobjetos.listaExercicios01.exercicio01.Pessoa;

public class Exercicio2 {

	public static void main(String[] args) {
		// 02

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Larissa");
		pessoa.setIdade(25);
		pessoa.setAltura(1.60);
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Bruno");
		pessoa1.setIdade(25);
		pessoa1.setAltura(1.60);
		
		Agenda agenda = new Agenda();
		agenda.armazenaPessoa(pessoa);
		agenda.armazenaPessoa(pessoa1);
		agenda.imprimeAgenda();
		agenda.buscaPessoa(pessoa1);
		System.out.println();
		agenda.imprimePessoa(0);

	}

}
