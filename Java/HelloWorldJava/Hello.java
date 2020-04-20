package com.motoboy.tarefa01;

// 1) Imprimir a mensagem e a língua solicitada, instanciando uma classe.

// 2) Imprimir a mensagem e a língua solicitada, modificando o atributo de uma classe já existente.

// 3) Imprimir a mensagem e a língua solicitada, modificando o atributo de uma classe já existente. Mensagem não
// foi imprimida em função da língua.

// Imprimir chamando os métodos getMessage e getLanguage ou imprimir só o nome do objeto e ele pega o que está no ToString().

public class Hello {

	public static void main(String[] args) {
				Message m1 = new Message("English");
				
				System.out.println(m1.getMessage());
				System.out.println(m1.getLanguage());
				
				m1.language = "Italian";
				
				System.out.println(m1);
				
				m1.language = "French";
				
				System.out.println(m1);

	}

}
