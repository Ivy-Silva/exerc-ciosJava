package TesteUm;

import java.util.Scanner;

public class ExemploDoWhile 
{
	public static void main (String args [])
	{
		Scanner in = new Scanner(System.in);
		int x = 0;
		double n1, n2, resultado = 0;
		
		do {
			System.out.println("1) somar ");
			System.out.println("2) subtrair");
			System.out.println("3) multiplicar");
			System.out.println("4) dividir");
			System.out.println("0) sair");
			
			System.out.println("Digite o código da operação desejada: ");
			x = in.nextInt();
			
			if ( x !=0 ) 
			{
				
				System.out.println("Digite o primeiro número: ");
				n1 = in.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				n2 = in.nextDouble();
				
				if ( x == 1) {
					resultado = n1 + n2;
				} else {
					if ( x == 2 ) {
						resultado = n1 - n2;
					} else {
						if ( x == 3) {
							resultado = n1 * n2;
						} else {
							resultado = n1 / n2;
						}
					}
				}
			}
			System.out.println();
			System.out.println("O resultado é: "+ resultado);
			System.out.println();
		}
		while ( x!=0 );
		
	} 
	
}
