package Main;

 public class Compra {
	private String nome;
	private String data;
	private String hora;
	static private int ID;
	private int quantidade;
	private float total;
	
	public Compra(int iD,String nome, int quantidade, float total,String data, String hora) {
		super();
		this.nome = nome;
		ID = iD;
		this.quantidade = quantidade;
		this.total = total;
		this.data=data;
		this.hora=hora;
	}

	public Compra() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return ID;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
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

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
}
