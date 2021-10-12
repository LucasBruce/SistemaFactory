package br.com.bruce.sistemaFactory;

import java.util.Scanner;

import br.com.bruce.sistemaFactory.service.PessoaMethodFactory;

//Method Factory é um padrão utilizado para encapsular a instaciação das classes

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PessoaMethodFactory methodFactory = new PessoaMethodFactory();
		String sexo = "", nome = "";
		int cont = 0;

		do {
			System.out.println("Digite a Letra <M> para Homem:");
			System.out.println("Digite a Letra <F> para Mulher:");
			sexo = scanner.next();
			if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {

				if (sexo.equalsIgnoreCase("M")) {
					System.out.println("Agora digite um nome masculino!");
					nome = scanner.next();
				} else if (sexo.equalsIgnoreCase("F")) {
					System.out.println("Agora digite um nome feminino!");
					nome = scanner.next();
				}
				  methodFactory.getPessoa(nome, sexo);

			}else {
				System.out.println("Letra inválida você não digitou <M> ou <F>.");
			}
			System.out.println("Digite <0> para Sair.");
			System.out.println("Digite qualquer número para continuar.");
			System.out.println("Digite <1> para saber a lista de pessoas.");
			cont = scanner.nextInt();
			
			if(cont == 1) {
				methodFactory.getPessoas();
			}
		} while (cont != 0);
		System.out.println("Finalizado...");
	}

}
