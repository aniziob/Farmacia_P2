package Repositorio;

import java.util.ArrayList;
import Main.Usuario;



	public class RepositorioUsuario {
		public static ArrayList <Usuario> nomes = new ArrayList<>();
	    Usuario u = new Usuario ();
	    public void Usuario (Usuario u) {
	    	
	    }
	    
	    public static boolean addUsuario (Usuario usu, int aux){  
	    
	    if(aux>=18) {
	    	
	    		nomes.add(usu);	       
	    		return true;
	  
	    }
	    else {
	    	return false;
	    
	    }
	}
	    
	    public static boolean buscar(String cpf){
	        boolean achei=false;
	        
	        for(Usuario u:nomes){
	            
	            if(u.getCpf().equals(cpf)){
	                achei=true;
	            }
	        }
	        return achei; 
	    } 
	    public static int buscarAlterar(String cpf){
	        int achei=0;
	        for(int i=0;i<RepositorioUsuario.nomes.size();i++) {
	        	  for(Usuario u:nomes){
	  	            if(u.getCpf().equals(cpf)){
	  	                achei=RepositorioUsuario.nomes.size();
	  	            }
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

		
		/*public String toString() {
			for( Usuario m :nomes) {
				return (m.toString() + "\n");
			}
		return null;
		}*/
	}



