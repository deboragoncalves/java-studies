package javaLang;

public class RegistroExercicio29 {
	private int codigoVendedor;
	private String nomeVendedor;
	private int precoVenda;
	private int mesVenda;
	
	public RegistroExercicio29() {
		
	}
	
	public int getCodigo() {
		return this.codigoVendedor;
	}
	
	public String getNomeVendedor() {
		return this.nomeVendedor;
	}
	
	public int getPrecoVenda() {
		return this.precoVenda;
	}
	
	public int getMesVenda() {
		return this.mesVenda;
	}
	
	public void setCodigo(int codigo) {
		this.codigoVendedor = codigo;
	}
	
	public void setNomeVendedor(String nome) {
		this.nomeVendedor = nome;
	}
	
	public void setPrecoVenda(int preco) {
		this.precoVenda = preco;
	}
	
	public void setMesVenda(int mes) {
		this.mesVenda = mes;
	}
	
}
