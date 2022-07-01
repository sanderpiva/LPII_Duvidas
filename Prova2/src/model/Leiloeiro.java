package model;

import java.util.List;

public class Leiloeiro {

	private String nome;
	private Leilao leilao;
	
	
	public Leiloeiro(Leilao l) {
		
		leilao = l;
		
	}


	public Lance vencedor(){
		
		double maiorLance = -1;
		Lance lanceCampeao = null;
		
		for(Lance l : leilao.getLances()) {
			
			
			if(l.getValor() > maiorLance) {
				
				maiorLance  = l.getValor();
				lanceCampeao = l;
				
			}
				
		}
		
		
		return lanceCampeao;
	}

	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
