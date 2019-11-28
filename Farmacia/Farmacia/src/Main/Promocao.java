package Main;

import java.time.LocalDate;

public class Promocao {
	private int idProduto;
	private float valorDesconto;
	private LocalDate dataInicio, dataFim;
	
	public Promocao(int idProduto, float valorDesconto, LocalDate dataInicio,
			LocalDate dataFim){
		this.idProduto = idProduto;
		this.valorDesconto = valorDesconto;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	//Promoção vai receber um id do produto/medicamento
	//Exemplo de desconto: 30% em um valor de 15 reais será
	//15-(0,30*15) 
	//Se data atual estiver dentro de período, dá desconto, se não, não da desconto
	/* Exemplo de comparação entre duas datas
	private static LocalDate dataInicio = LocalDate.of(2019, 11, 25);
	private static LocalDate dataFim = LocalDate.of(2019, 11, 28);
	private static Period periodo = Period.between(dataInicio, dataFim);
	private static LocalDate hoje = LocalDate.now();
	
	public static void main(String[] args) {
		if (dataInicio.isBefore(hoje) && dataFim.isAfter(hoje)) {
			System.out.println("é sim");
		}else if(dataInicio.equals(hoje) || dataFim.equals(hoje)) {
			System.out.println("igual");
		}else {
			System.out.println("diferentes");
		}

	}
	 */
	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDate getDataFim() {
		return dataFim;
	}


	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public float getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	
}
