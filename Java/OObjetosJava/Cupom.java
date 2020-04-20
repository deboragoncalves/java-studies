package com.motoboy.tarefas050607;

// Cupom é a classe filha de Cliente. O Cliente pode ter um Cupom ou não.

// ToString para deixar o main enxuto.

// Pode-se alterar o cupom modificando o atributo da classe Cupom. c1.cupomDesconto. 
// Ou instanciando uma nova classe Cupom e gerando um novo cupom, através do Construtor.

// Utilizar herança para declarar construtor com atributo cupom e outros atributos da classe mãe Cliente. Simplifica código

// Método desconto para calcular desconto, conforme cupom Digitado. Se parâmetro for igual a Motoboy2020, 10%. 

// Utilizar herança para pegar o preço através do setPreco() da classe mãe Cliente.

// Método desconto, que vai calcular o desconto se a cidade informada ao instanciar a classe Cupom, for as cidades
// em que a Motoboy está presente. Exige como parâmetro o Cupom, que deve ser o mesmo informado ao instanciar a classe. 
// Se for diferente, vai exibir a mensagem e não calcular. Se o cupom for diferente de Motoboy2020, informar
// que não há desconto para esse cupom.

// Sobrecarga do método desconto, com mais um parâmetro necessidade. Desconto de 20% se tiver cupom e 
// se a necessidade for Agengamento, desconto de 20%. Fora isso - preco normal. Se o cupom for diferente de Motoboy2020, informar
// que não há desconto para esse cupom. Os parâmetros informados devem ser os mesmos dos atributos da Classe.
// Se não for, mensagem informando.

// Método ToString() para imprimir e simplificar código
// Utilizar polimorfismo, imprimindo os dados que já estão na classe mãe Cliente mais os dados do Cupom, os preços para quem 
// tem cupom de Desconto e para quem tem cupom e a Necessidade é agendamento.

	public class Cupom extends Cliente {
		String cupomDesconto;

		public Cupom (String cidade, String necessidade, String cupom) {
			super(cidade, necessidade);
			this.cupomDesconto = cupom;
		} 
	
	public void desconto(String cupom) {
		
		 if (cupom.equals(this.cupomDesconto)) {
			if (cupom.equals("Motoboy2020")) {
				
				if (super.cidade.equals("Joinville") || super.cidade.equals("Curitiba") || super.cidade.equals("São Paulo")) {
					double n2 = super.setPreco();
					n2 -= 0.1 * n2;
					System.out.println("\nPreço com desconto para Cupom " + this.cupomDesconto + ": R$ " + n2);
				} else {
					System.out.println("\nNão estamos disponíveis nessa cidade.");
				} 
			} else {
				System.out.println("\nNão oferecemos desconto para este cupom.");
			}
		} else {
			System.out.println("\nO cupom informado como argumento da função é diferente do cupom que foi instanciado no objeto. Informe os mesmos cupons.");
		}
	}
	
	public void desconto(String cupom, String necessidade) {
		
			if (necessidade.equals(super.necessidade) && cupom.equals(this.cupomDesconto)) {
				if (super.cidade.equals("Joinville") || super.cidade.equals("Curitiba") || super.cidade.equals("São Paulo")) {
					
					if (necessidade.equals("Agendamento") && cupom.equals("Motoboy2020")) {
						double n2 = super.setPreco();
						n2 -= 0.2 * n2;
						System.out.println("\nPreço com desconto para Cupom " + cupom + " e Necessidade de " + necessidade + ": R$ " + n2);
					} else {
						System.out.println("\nNão oferecemos desconto para essa necessidade e cupom.");
					}
					
				} else {
					System.out.println("\nNão estamos disponíveis nessa cidade.");
				}
			} else {
				System.out.println("\nOs parâmetros informados na função são diferentes dos argumentos que foram instanciados no objeto.");
			}
	
	}
	
	public String toString() {
		
		return super.toString() + "\nCupom de desconto: " + this.cupomDesconto;
		
	}
	
	} 
	

