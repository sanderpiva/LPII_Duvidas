package model;

public class Usuario {
	
	private String cpf;
	private String nome;
	
	public Usuario(String cpf) {
		
		this.cpf= cpf;		
	}

	public String getCpf() {
		return cpf;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
