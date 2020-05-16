package ExercíciosFixação;

//Exercício 2
public class ExDoisDivisivelPorOnze {
	public static void main (String args []) {
		for (int i =1000; i < 2000; i++) {
			if (i%11 ==0) {
				System.out.println("Esse número é divisível por 11: " +i);
			} else
				if (i%11==5) {
					System.out.println("Esse número tem resto 5: " +i);
				}
		}
		
	}
}
