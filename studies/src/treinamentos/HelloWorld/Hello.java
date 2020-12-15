package treinamentos.HelloWorld;

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
