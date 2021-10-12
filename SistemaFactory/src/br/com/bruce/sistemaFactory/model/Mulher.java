package br.com.bruce.sistemaFactory.model;

public class Mulher extends Pessoa {

	public Mulher(String nome) {
		this.nome = nome;
		System.out.println();
		System.out.println("Olá senhora " + this.nome);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Olá senhora " + this.nome;
	}
	
}
