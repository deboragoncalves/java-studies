package com.motoboy.tarefa01;

// Classe Mensagem, com dois atributos. Um privado, que é a mensagem, pra não poder ser alterada. E um público, para que o usuário
// altere, sem chamar um método específico.

// Construtor para a classe Mensagem, como parâmetro a língua que se deseja.

// Método getMessage altera a mensagem de acordo com a língua escolhida ao instanciar a classe. Se não for nenhuma,
// o atributo mensagem recebe uma mensagem que não foi possível.

// Método getLanguage que mostra a língua escolhida, seja ao instanciar a classe ou ao alterar a língua pelo atributo.

// Método ToString imprime o que foi retornado nos métodos getMessage() e getLanguage().

public class Message {
	private String message;
	public String language;
	
	public Message(String speak) {
		this.language = speak;
	}
	
	public String getMessage() {
		if (this.language.equals("Portuguese")) {
			return this.message = "Olá Mundo";
		} else if (this.language.equals("English")) {
			return this.message = "Hello World";
		} else if (this.language.equals("Spanish")) {
			return this.message = "Hola mundo";
		} else if (this.language.equals("Italian")) {
			return this.message = "Ciao mondo";
		} else {
			return this.message = "Sorry, it wasn't possible translate to this language. Try another one.";
		}
	
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	@Override
	 public String toString() {
		return "\nMessage: " + this.getMessage() + "\nLanguage: " + this.getLanguage();
	} 
}
