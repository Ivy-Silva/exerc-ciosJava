package ExeDois;

import java.util.Scanner;

public class ConsumirIdade {

public static void main(String[] args) {
		
		String nome;
		int anoNascimento;		
		
		//Instanciar objeto
		Pessoa pessoaaleatoria = new Pessoa("", 0 );
		
		Scanner teclado = new Scanner (System.in);
		
		// entradas usuarios
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		pessoaaleatoria.setNome(nome);
		
		System.out.print("Informe seu ano de Nascimento: ");
		anoNascimento = teclado.nextInt();
		pessoaaleatoria.setAnoNascimento(anoNascimento);
		
		//mostrando resultados
		System.out.println();
		pessoaaleatoria.idadePessoa();
		pessoaaleatoria.idadePessoaDaqui50Anos();
	}

	
}
