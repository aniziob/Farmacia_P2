package Main;

public class Medicamento {
    private  int id;	
	private  String nome;
	private int quantidade;
	private float pre�o;
	private int QuantRemove;
	//Marcelo
	private boolean promoAtiva = false;
	
	public boolean isPromoAtiva() {
		return promoAtiva;
	}
	public void setPromoAtiva(boolean promoAtiva) {
		this.promoAtiva = promoAtiva;
	}
	
	public int getQuantRemove() {
		return QuantRemove;
	}
	public void setQuantRemove(int quantRemove) {
		QuantRemove += +quantRemove;
	}


	private int index;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = +quantidade;
	}
	public void setQuantidade1(int quantidade) {
		this.quantidade += quantidade;
	}
	public float getPre�o() {
		return pre�o;
	}
	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}
	public Medicamento(int id, String nome1, int quantidade, float pre�o) {
		this.id = id;
		this.nome = nome1;
		this.quantidade = quantidade;
		this.pre�o = pre�o;
	}
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome1) {
		this.nome = nome1;
	}
	
	
	@Override
	public String toString() {
		return (this.getId() +" "+this.getNome());
	}

}
