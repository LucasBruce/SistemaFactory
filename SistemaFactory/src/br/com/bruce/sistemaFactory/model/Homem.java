package br.com.bruce.sistemaFactory.model;

public class Homem extends Pessoa {

	public Homem(String nome) {
		this.nome = nome;
		System.out.println();
		System.out.println("Olá senhor " + this.nome);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Olá senhor " + this.nome;
	}
}
