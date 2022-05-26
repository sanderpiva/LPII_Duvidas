package model;

public class Moto extends Veiculo {
	
	private String transmissao;
	
	public Moto(String marca, String modelo, String transmissao) {
		
		super(marca, modelo);
		this.transmissao = transmissao;
	}

	public String getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}
	
	@Override
	public String dadosFormatados() {
		//com o 'super.' pego o metodo da classe mae 'Usuario'
		String dadosVeiculo = super.dadosFormatados();
		String dadosMoto = String.format("Transmissao: %s ", this.transmissao);

		return dadosVeiculo + dadosMoto;
	}
	
	
	
	
}
