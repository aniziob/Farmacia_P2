package Main;
//@author Anizio Barbosa
public class Medicamento {
    private int id;	
	private String nome1;
	
	
	public Medicamento(int id, String nome1) {
		this.id = id;
		this.nome1 = nome1;

	}
	
	
	
	public Medicamento() {
		
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome1;
	}
	public void setNome(String nome1) {
		this.nome1 = nome1;
	}
	
	@Override
	public String toString() {
		return (this.getId() +" "+this.getNome());
	}


}
