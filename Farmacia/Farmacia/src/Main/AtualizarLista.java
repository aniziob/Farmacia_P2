package Main;

public class AtualizarLista {
	private String nome;
	private int ID;
	private int quantidade;
	private float pre�o;

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public float getPre�o() {
		return pre�o;
	}


	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}


	public  AtualizarLista(int ID, String nome, int quantidade, float d) {
		this.ID=ID;
		this.nome=nome;
		this.quantidade=quantidade;
		this.pre�o=d;
	}


	@Override
	public String toString() {
		return "AtualizarLista [nome=" + nome + ", ID=" + ID + ", quantidade=" + quantidade + ", pre�o=" + pre�o + "]";
	}
}
