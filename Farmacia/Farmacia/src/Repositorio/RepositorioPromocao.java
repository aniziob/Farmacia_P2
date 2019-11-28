package Repositorio;

import java.time.LocalDate;
import java.util.ArrayList;

import Main.Medicamento;
import Main.Promocao;

public class RepositorioPromocao {
	public static  ArrayList <Promocao> repPromo = new ArrayList<>();
	
	public void addPromocao (Promocao promo) {
		repPromo.add(promo);
	}
	public void removePromocao(Promocao promo) {
		repPromo.remove(promo);
	}
	
	public void aplicarDesconto(int id) {
		float desconto = 0;
		Medicamento achei = RepositorioMedicamento.buscaParaPromo(id);
		if(achei != null) {
			for(Promocao u:repPromo){
	            if(u.getIdProduto()==(id)){
	                desconto = u.getValorDesconto();
	            }
	        }
			achei.setPreço(achei.getPreço() - (achei.getPreço() * desconto));
		}
	}
	
	public boolean verificaVigencia(int id) {
		LocalDate dataInicio, dataFim, hoje = LocalDate.now();
		for(Promocao u:repPromo){
            if(u.getIdProduto()==(id)){
            	dataInicio = u.getDataInicio();
            	dataFim = u.getDataFim();
            	
            	if (dataInicio.isBefore(hoje) && dataFim.isAfter(hoje)) {
            		//Ta dentro da vigencia
        			return true;
        		}else if(dataInicio.equals(hoje) || dataFim.equals(hoje)) {
        			//É igual a uma das datas, então ta dentro da vigência
        			return true;
        		}else {
        			//Não ta dentro da vigência
        			return false;
        		}
                
            }
        }
		return false;
	}
	
	public String toString() {
		for( Promocao promo :repPromo) {
			return (promo.toString());
		}
		return null;
	}
}
