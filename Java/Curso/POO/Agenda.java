package poo;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();
	private int tamanhoMaximo = 10;
	
	public void armazenaPessoa(Pessoa pessoa) {
		int tamanhoLista = this.contatos.size();
		
		if (tamanhoLista < tamanhoMaximo) {
			contatos.add(pessoa);
		} else {
			System.out.println("A lista está em seu tamanho máximo.");
		}
	}
	
	public void removePessoa(Pessoa pessoa) {
		int tamanhoLista = this.contatos.size();
		
		if (tamanhoLista > 0) {
			contatos.remove(pessoa);
		} else {
			System.out.println("A lista não possui elementos.");
		}
	}
	
	public void buscaPessoa(Pessoa pessoa) {
		for (Pessoa p : contatos) {
			if (pessoa == p) {
				System.out.println("Índice: " + contatos.indexOf(pessoa));
			} 
		}
	}
	
	public ArrayList<Pessoa> imprimeAgenda() {
		for (Pessoa pessoa : contatos) {
			System.out.println(pessoa);
			System.out.println();
		}
		return null;
	}
	
	public void imprimePessoa(int posicao) {
		System.out.println(this.contatos.get(posicao));
	}
	
}
