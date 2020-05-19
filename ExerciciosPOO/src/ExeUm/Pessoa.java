package ExeUm;

public class Pessoa {
	
		//atributos	
		private String nome;
		private String email;
		private String telefone;
		//fim-atributos
		
		// metodo construtor
		public Pessoa (String nome, String email, String telefone) {
			this.nome = nome;
			this.email= email;
			this.telefone = telefone;
		} // fim-metodo-construtor;

		// GETTERS AND SETTERS;
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		} // fim-GETTERS-AND-SETTERS;
		
		// outros metodos da classe
		public void mostraCartaoDeVisita() {
			System.out.println("Nome: " + getNome() + "\n" + "E-mail: " + getEmail() + "\n" + "Telefone: " + getTelefone());
		} //fim-da-criação-de-outros-metodos;

	}
