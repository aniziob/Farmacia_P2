package Main;

public class AtualizarLista {
	private String nome;
	private int ID;
	private int quantidade;
	private float preço;

	
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


	public float getPreço() {
		return preço;
	}


	public void setPreço(float preço) {
		this.preço = preço;
	}


	public  AtualizarLista(int ID, String nome, int quantidade, float d) {
		this.ID=ID;
		this.nome=nome;
		this.quantidade=quantidade;
		this.preço=d;
	}


	@Override
	public String toString() {
		return "AtualizarLista [nome=" + nome + ", ID=" + ID + ", quantidade=" + quantidade + ", preço=" + preço + "]";
	}
}
