package model;

public class Veiculo {

	private String marca;
	private String modelo;

	public Veiculo(String pMarca, String pModelo) {

		this.marca = pMarca;
		this.modelo = pModelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String pMarca) {
		this.marca = pMarca;
	}

	public String getModelo() {
		return this.modelo;
	}


	public void setModelo(String pModelo) {
		this.modelo = pModelo;
	}

	public String dadosFormatados() {

		return String.format("Marca: %s \nModelo: %s \n", this.marca, this.modelo);

	}

}
