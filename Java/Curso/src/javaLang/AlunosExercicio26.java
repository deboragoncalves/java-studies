package javaLang;

public class AlunosExercicio26 {
	private String matricula;
	private String sobrenome;
	private int anoNascimento;
	
	public AlunosExercicio26() {
		
	}
	
	public AlunosExercicio26 (String matricula, String sobrenome, int ano) {
		this.matricula = matricula;
		this.sobrenome = sobrenome;
		this.anoNascimento = ano;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public int getAnoNascimento() {
		return this.anoNascimento;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setAnoNascimento(int ano) {
		this.anoNascimento = ano;
	}

}
