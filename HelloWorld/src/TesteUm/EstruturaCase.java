package TesteUm;

import java.util.Scanner;

public class EstruturaCase {
	public static void main (String args [])
	{
		Scanner leitor = new Scanner(System.in);
		int dia = 0;
		System.out.println("Digite um número para saber qual o dia da semana: ");
		dia = leitor.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Número digitado é inválido!");
			break;
	}
	}

}
