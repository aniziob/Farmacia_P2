package Main;
//@author Anizio Barbosa
public class Usuario {
	 private  String cpf;	
	 private  String nome;
		
		
		public Usuario(String cpf, String nome) {
			this.cpf = cpf;
			this.nome = nome;

		}
		
		
		
		public Usuario() {
			// TODO Auto-generated constructor stub
		}



		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String toString() {
			return ("Nome: " + this.getNome() + "\n" + "CPF: " + this.getCpf());
		}
}
