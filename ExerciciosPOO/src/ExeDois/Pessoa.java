package ExeDois;

public class Pessoa {
	
		//atributos
		private String nome;
		private int anoNascimento;
		
		//contrutor
		public Pessoa(String nome, int anoNascimento) {
			this.nome = nome;
			this.anoNascimento = anoNascimento;
		}

		//generate getters and setters
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getAnoNascimento() {
			return anoNascimento;
		}

		public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
		}
		
		
		// outros metodos
		public void idadePessoa() {
			int idade = 2020 - anoNascimento;
			System.out.println(nome+" você está com " + idade + " anos em 2020.");
		}
		
		public void idadePessoaDaqui50Anos() {
			int idadeDaqui50Anos = (2020-anoNascimento) + 50;
			System.out.println("E daqui 50 anos você terá " + idadeDaqui50Anos + " anos.");
		}

}
