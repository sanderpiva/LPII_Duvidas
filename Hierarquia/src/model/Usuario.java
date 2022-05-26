package model;

public class Usuario {
	
	private String nome;
	private String endereco;
	private String rg;
	
	public Usuario(String pNome, String pEndereco, String pRG) {
		
		this.nome  = pNome;
		this.endereco  = pEndereco;
		this.rg = pRG;
		
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String pNome) {
		this.nome = pNome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String pEndereco) {
		this.endereco = pEndereco;
	}
	
	
	
	public String getRG() {
		return this.rg;
	}

	public void setRG(String pRG) {
		this.rg = pRG;
	}

	public String formataDados() {
		
	  return String.format("Nome: %s \nEndereco: %s \nRG: %s ", this.nome, this.endereco, this.rg);
		
	}
	
}
