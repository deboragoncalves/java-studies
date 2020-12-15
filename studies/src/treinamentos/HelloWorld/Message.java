package treinamentos.HelloWorld;

public class Message {
	private String message;
	public String language;
	
	public Message(String speak) {
		this.language = speak;
	}
	
	public String getMessage() {
		if (this.language.equals("Portuguese")) {
			return this.message = "Ol� Mundo";
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
