package model;

public abstract class Produto {

	private String tipo;
	
	public Produto(String tipo) {
		
		this.tipo = tipo;	
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract String informacoes();	
}
