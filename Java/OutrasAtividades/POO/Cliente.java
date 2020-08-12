package com.motoboy.tarefas050607;

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
