package com.motoboy.tarefa02;

public class Dados {
	public int nota;
	public String nome;
	
	public Dados() {}
	
	public Dados(String name, int note) {
		this.nome = name;
		this.nota = note;
	}
	
	@Override
	public String toString() {
		return "Nome do Motoboy: " + this.nome +
				"\nNota do Motoboy: " + this.nota;
	}
}
