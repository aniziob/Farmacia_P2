package GUI;

import java.util.Scanner;

import Main.Medicamento;
import Main.Usuario;
import Repositorio.RepositorioMedicamento;
import Repositorio.RepositorioUsuario;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		//RepositorioMedicamento repositorioMed = new RepositorioMedicamento();
		//RepositorioUsuario repositorioUsu = new RepositorioUsuario();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//char sim = 's';
		//char nao = 'n';
		String nome;
		String cpf;
		//String nome1 = null;
		//int id = 0;
		//String compra;
		
		//RepositorioUsuario
		
		System.out.println("Bem Vindo ao Cadastro de Usuario\n");
		
		System.out.println("Digite o Nome do Usuario a ser Cadastrado");
		nome = scan.nextLine();
		
		System.out.println("Digite o Cpf a ser cadastrado ");
		cpf = scan.nextLine();
		
	
		
		Usuario usu;
		
		usu = new Usuario();
		
		usu.setCpf(cpf);
		usu.setNome(nome);
		if(RepositorioUsuario.addUsuario(usu)==true) {
			 System.out.println("Usuario Cadastrado com Sucesso. ");
		}else {
			System.out.println("Usuario não foi Cadastrado");
		}
		
		System.out.print("\nUsuario Disponiveis:\n");
		
		for(int i = 0; i < RepositorioUsuario.nomes.size(); i++) {
			System.out.print(RepositorioUsuario.nomes.get(i).toString()+"\n");
		}
		
		RepositorioMedicamento rep = new RepositorioMedicamento();
		
		Medicamento m0 = new Medicamento (1 ,"Besetacil");
		Medicamento m1 = new Medicamento (2 ,"Suprin");
		Medicamento m2 = new Medicamento (3 ,"Platin");
		Medicamento m3 = new Medicamento (4 ,"Bacina");
		Medicamento m4 = new Medicamento (5 ,"Dacogen");
		Medicamento m5 = new Medicamento (6 ,"Daivobet");
		Medicamento m6 = new Medicamento (7,"Dainitre");
		Medicamento m7 = new Medicamento (8 ,"Dagli");
		Medicamento m8 = new Medicamento (9 ,"Daflon");
		Medicamento m9 = new Medicamento (10 ,"Ecos");
		
		rep.addMedicamento(m0);
		rep.addMedicamento(m1);
		rep.addMedicamento(m2);
		rep.addMedicamento(m3);
		rep.addMedicamento(m4);
		rep.addMedicamento(m5);
		rep.addMedicamento(m6);
		rep.addMedicamento(m7);
		rep.addMedicamento(m8);
		rep.addMedicamento(m9);
		
		//REMOVEU aux=1 DESSA LINHA AQUI DE BAIXO
		int exit=1,exit1=1;
		do {
		int opcao=0;
		
		System.out.println("Menu principal");
		System.out.println("[1] Remedios disponiveis");
		System.out.println("[2] Comprar remedios");
		System.out.println("[3] Sai do programa");
		opcao = scan.nextInt();
		
		switch (opcao)
		{
			case 1:
				System.out.print("\nRemedios Disponiveis em estoque:\n");
				for(int i = 0; i < rep.repMed.size(); i++) {
					System.out.print(rep.repMed.get(i).toString()+"\n");
				}
				break;
		
				case 2:
					do {
						int opcao1=0;
						System.out.print("\nRemedios Disponiveis:\n");
						for(int i = 0; i < rep.repMed.size(); i++) {
							System.out.print( " "+rep.repMed.get(i)+"\n");
						}
						System.out.println("Escreva o ID do Remedio que deseja Comprar. e 0 para cancelar a compra.");
						opcao1 = scan.nextInt();
						if (opcao1!=0) {
							//ANTES NÃO PODIA COMPRAR QUALQUER NUMERO SÓ DE CIMA PARA BAIXO
							// AGORA ESTA DANDO NULL POINTER EXCEPTION PQ ESTOU INICIANDO M COMO NULL
							//SE ARRUMAR ISSO VAI FUNCIONAR NORMAL
							
							for(int i = 0; i < rep.repMed.size(); i++) {
									 if (rep.repMed.get(i).getId() == opcao1){
										 rep.removeMedicamento(rep.repMed.get(i));
									 }
								
								 }
						}else
						if(opcao1==0) {
							System.out.println("Menu principal");
							exit1=0;
						}
						
						
						}while(exit1!=0);
				break;
				
		
				case 3:
			
					System.out.println("Programa encerrado!");
					exit=0;
		
				break;
		}
		}while(exit!=0);
	
	
     }
	
		
		
	}


