package Repositorio;

import java.util.ArrayList;


import Exceptions.MedicamentoNaoExisteException;
import Main.Medicamento;
//@author Anizio Barbosa
public class RepositorioMedicamento {
	public void Medicamento()  throws MedicamentoNaoExisteException {
		
		}
	
	public ArrayList <Medicamento> repMed = new ArrayList<>();
	
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void addMedicamento(Medicamento medi) {
		repMed.add(medi);
	}
	
	public void removeMedicamento(Medicamento medi) {
		repMed.remove(medi);
	}

	@Override
	public String toString() {
		for( Medicamento medi :repMed) {
			return (medi.toString());
		}
	return null;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public void AddMedicamento (Medicamento med){  
		this.nomes.add(med);
}

public Medicamento buscar(String nome){
    Medicamento find=null;
    
    for(Medicamento p:this.nomes){
        
        if(p.getNome()==nome){
            find=m;
            System.out.println(" Seu Medicamento " +p.getNome() + " Foi Encontrado ");
        }
     
      
    }
    return find; 
}

public Medicamento delet(String nome) {
    Medicamento delet = null;
    for (Medicamento med : this.nomes) {
        if (m.getNome() == nome) {
            nomes.remove(m);
        }
        break;
    }
    return delet;
}


public boolean alterarMedicamento (Medicamento med){
    
    for (Medicamento med1:this.nomes){
        if (m.getNome() == m.getNome()){
            
            nomes.remove(m);
            nomes.add(m);
            return true;
        }
    }
    return false;
}



 
}
*/


}


