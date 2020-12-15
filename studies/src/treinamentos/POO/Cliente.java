package treinamentos.POO;

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
			} else if (this.cidade.equals("S�o Paulo")) {
				return this.preco = 30.0;
			} else {
				return 0; 
			}
		}
		
		@Override
		public String toString() {
			
			if (this.cidade.equals("Joinville") || this.cidade.equals("Curitiba")  || this.cidade.equals("S�o Paulo")) {
				return "\nInforma��es: \nCidade: " + 
						this.cidade + "\nNecessidade: " 
						+ this.necessidade + "\nEndere�o de origem: " 
						+ this.origem + "\nEndere�o de destino: "
						+ this.destino + "\nPre�o: R$ " + this.setPreco();
			} else {
				return "\nN�o estamos dispon�veis nessa cidade";
			}
			
			
		}

}
