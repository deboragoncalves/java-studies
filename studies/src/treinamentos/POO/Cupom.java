package treinamentos.POO;

	public class Cupom extends Cliente {
		String cupomDesconto;

		public Cupom (String cidade, String necessidade, String cupom) {
			super(cidade, necessidade);
			this.cupomDesconto = cupom;
		} 
	
	public void desconto(String cupom) {
		
		 if (cupom.equals(this.cupomDesconto)) {
			if (cupom.equals("Motoboy2020")) {
				
				if (super.cidade.equals("Joinville") || super.cidade.equals("Curitiba") || super.cidade.equals("S�o Paulo")) {
					double n2 = super.setPreco();
					n2 -= 0.1 * n2;
					System.out.println("\nPre�o com desconto para Cupom " + this.cupomDesconto + ": R$ " + n2);
				} else {
					System.out.println("\nN�o estamos dispon�veis nessa cidade.");
				} 
			} else {
				System.out.println("\nN�o oferecemos desconto para este cupom.");
			}
		} else {
			System.out.println("\nO cupom informado como argumento da fun��o � diferente do cupom que foi instanciado no objeto. Informe os mesmos cupons.");
		}
	}
	
	public void desconto(String cupom, String necessidade) {
		
			if (necessidade.equals(super.necessidade) && cupom.equals(this.cupomDesconto)) {
				if (super.cidade.equals("Joinville") || super.cidade.equals("Curitiba") || super.cidade.equals("S�o Paulo")) {
					
					if (necessidade.equals("Agendamento") && cupom.equals("Motoboy2020")) {
						double n2 = super.setPreco();
						n2 -= 0.2 * n2;
						System.out.println("\nPre�o com desconto para Cupom " + cupom + " e Necessidade de " + necessidade + ": R$ " + n2);
					} else {
						System.out.println("\nN�o oferecemos desconto para essa necessidade e cupom.");
					}
					
				} else {
					System.out.println("\nN�o estamos dispon�veis nessa cidade.");
				}
			} else {
				System.out.println("\nOs par�metros informados na fun��o s�o diferentes dos argumentos que foram instanciados no objeto.");
			}
	
	}
	
	public String toString() {
		
		return super.toString() + "\nCupom de desconto: " + this.cupomDesconto;
		
	}
	
	} 
	

