package br.com.bruce.sistemaFactory.service;

import java.util.ArrayList;
import java.util.List;

import br.com.bruce.sistemaFactory.model.Homem;
import br.com.bruce.sistemaFactory.model.Mulher;
import br.com.bruce.sistemaFactory.model.Pessoa;

public class PessoaMethodFactory {

	private List<Pessoa> pessoas = new ArrayList<>();
	
	public Pessoa getPessoa(String nome, String sexo) {
		Pessoa pessoa = null;
		if (sexo.equalsIgnoreCase("M")) {
			pessoa = new Homem(nome);

		} else if (sexo.equalsIgnoreCase("F")) {
			pessoa = new Mulher(nome);
		}
		pessoas.add(pessoa);
		return pessoa;
	}
	
	public void getPessoas(){
		for(Pessoa p:pessoas) {
			System.out.println(p);
		}
	}
}
