package com.motoboy.tarefas050607;

// Declarar atributos como public para que seja possível digitar
// Declarar como private o preço para não conseguir alterar e implementar método get
// Construtor padrão, utilizado quando se deseja receber informações - objeto.atributo = variavel.nextLine();
// Construtor com 4 parâmetros, caso se deseje instanciar a classe dessa forma
// Construtor com 2 parâmetros, para ser utilizado na Classe Cupom e o usuário informar
// menos parâmetros.
// Método setPreco retorna double e vai imprimir o preço de acordo com o que foi digitado/instanciado na cidade.
// Se a cidade não tiver entre aquelas em que a Motoboy está, preço 0.0.
// Método ToString para imprimir informações e simplificar código
// No ToString, criar if/else, para se a cidade for uma daquelas em que a Motoboy está presente,
// imprimir as informações e o preço, mas se não for, imprimir que não está presente.

public class Cliente {
	
		public String cidade;
		public String necessidade;
		public String origem;
		public String destino;
		private double preco;
		
		public Cliente() {
		}
		
		public Cliente(String city, String necessity, String begin, String finish) {
			this.cidade = city;
			this.necessidade = necessity;
			this.origem = begin;
			this.destino = finish;
		}
		
		public Cliente(String cidade2, String necessidade2) {
			this.cidade = cidade2;
			this.necessidade = necessidade2;
		}

		public double setPreco() {
			
			if (this.cidade.equals("Joinville")) {
				return this.preco = 20.0;
			} else if (this.cidade.equals("Curitiba")) {
				return this.preco = 25.0;
			} else if (this.cidade.equals("São Paulo")) {
				return this.preco = 30.0;
			} else {
				return 0; 
			}
		}
		
		@Override
		public String toString() {
			
			if (this.cidade.equals("Joinville") || this.cidade.equals("Curitiba")  || this.cidade.equals("São Paulo")) {
				return "\nInformações: \nCidade: " + 
						this.cidade + "\nNecessidade: " 
						+ this.necessidade + "\nEndereço de origem: " 
						+ this.origem + "\nEndereço de destino: "
						+ this.destino + "\nPreço: R$ " + this.setPreco();
			} else {
				return "\nNão estamos disponíveis nessa cidade";
			}
			
			
		}

}
