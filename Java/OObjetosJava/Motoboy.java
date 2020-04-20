package com.motoboy.tarefas050607;

import java.util.Scanner;

// Instanciar classe mãe Cliente, com construtor padrão e Objeto Scanner para ler o que foi digitado.

// A classe também pode ser instanciada através do Construtor com os atributos: cidade, necessidade, origem, destino.

// Ler dados que forem digitados, chamando o objeto n1 e cada atributo.

// Instanciar classe Cupom, caso tenha cupom. O construtor da classe exige os atributos da
// classe Cliente (dados: cidade, necessidade) e o atributo Cupom. (Aplicação de herança no Construtor de Cupom).

// Posso informar os mesmos atributos da classe Cliente já instanciada ou outros atributos. Vai imprimir de acordo com o que for
// instanciado na classe Cupom.

// Ao imprimir o objeto instanciado em Cupom, imprime-se todas as informações de Cliente (dados e preço) 
// e o cupom passado no Construtor. (Aplicação de Herança no método ToString()).

// O preço calculado na classe Cliente é com base na cidade. Se não for em uma das cidades, vai exibir uma mensagem que a empresa
// não está disponível nessas cidades.

// Ao aplicar o método desconto, há duas formas: passando um argumento, o Cupom e passando 2 argumentos, o cupom e a necessidade.

// O desconto calculado é com base na cidade. Se a cidade informada ao instanciar a classe for diferente das cidades em que 
// a Motoboy está presente, vai dizer que a Motoboy não está presente nessas cidades.

// Há desconto se o cupom for Motoboy2020 e se a necessidade for Agendamento. Tudo o que for diferente disso, 
// mensagem que não há desconto.

// Se o que for passado como argumento da função desconto for diferente das informações instanciadas na Classe, vai exibir a mensagem
// de que há diferença e não vai calcular o desconto.

public class Motoboy {
	public static void main(String[] args) {
				
					Scanner teclado = new Scanner(System.in);
					
					Cliente n1 = new Cliente();
					
					System.out.println("Digite a sua cidade: ");
					n1.cidade = teclado.nextLine();
					
					System.out.println("Digite a sua necessidade (Imediata/Agendamento): ");
					n1.necessidade = teclado.nextLine();
					
					System.out.println("Digite o seu endereço de origem: ");
					n1.origem = teclado.nextLine();
					
					System.out.println("Digite o seu endereço de destino: ");
					n1.destino = teclado.nextLine();
					
					System.out.println(n1); 
					
					Cliente n2 = new Cliente ("São Paulo", "Agendamento", "Rua x", "Rua y");
					
					System.out.println(n2);
					
					Cupom cupom = new Cupom("Joinville", "Agendamento", "Motoboy2020"); 
					
					System.out.println(cupom);
					
					cupom.desconto("Motoboy2020");
					cupom.desconto("Motoboy2020", "Imediata");
					
					// teclado.close();
	}

}
