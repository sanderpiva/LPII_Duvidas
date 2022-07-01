package model;

public class Carro extends Produto {
	
	private String marca;
	private String modelo;
	
	public Carro(String tipo) {
		
		super(tipo);
	}
	

	@Override
	public String informacoes() {
		
		return marca + " " + modelo;
	}
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
