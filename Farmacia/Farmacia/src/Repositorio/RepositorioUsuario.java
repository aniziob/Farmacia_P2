package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Main.Medicamento;
import Main.Usuario;



	public class RepositorioUsuario {
		public static ArrayList <Usuario> nomes = new ArrayList<>();
	    Usuario u = new Usuario ();
	    public void Usuario (Usuario u) {
	    	
	    }
	    
	    public static boolean addUsuario (Usuario usu){  
	    try{
	        nomes.add(usu);	       
	        return true;
	    }catch (Exception e){
	        return false;
	    } 
	}
	    
	    public Usuario buscar(int cpf){
	        Usuario achei=null;
	        
	        for(Usuario u:this.nomes){
	            
	            if(u.getCpf().equals(cpf)){
	                achei=u;
	                System.out.println(" Usuario " +u.getNome() + " Encontrado ");
	            }
	         
	          
	        }
	        return achei; 
	    }
	    
	  /*  public Usuario delet(int cpf) {
	        Usuario delet = null;
	        for (Usuario usu : this.nomes) {
	            if (u.getCpf().equals(cpf)) {
	                nomes.remove(u);
	            }
	            break;
	        }
	        return delet;
	    }*/

	    
	    /*public boolean alterarUsuario (Usuario usu){
	        
	        for (Usuario usua:this.nomes){
	            if (u.getCpf() == u.getCpf()){
	                
	                nomes.remove(u);
	                nomes.add(u);
	                return true;
	            }
	        }
	        return false;
	    }*/

		public static void add(Usuario usu) {
			// TODO Auto-generated method stub
			
		}
		
		/*public String toString() {
			for( Usuario m :nomes) {
				return (m.toString() + "\n");
			}
		return null;
		}*/
	}



