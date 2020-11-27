package heranca.Exercicio0102;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String novoNome, String novoEndereco, String novoTelefone) {
		this.nome = novoNome;
		this.endereco = novoEndereco;
		this.telefone = novoTelefone;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setEndereco(String novoEndereco) {
		this.endereco = novoEndereco;
	}
	
	public void setTelefone(String novoTelefone) {
		this.telefone = novoTelefone;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
	}

}
