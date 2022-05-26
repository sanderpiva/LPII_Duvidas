package model;

public class Moto extends Veiculo {
	
	private String transmissao;
	
	public Moto(String pMarca, String pModelo, String pTransmissao) {
		
		super(pMarca, pModelo);
		this.transmissao = pTransmissao;
	}

	public String getTransmissao() {
		return this.transmissao;
	}

	public void setTransmissao(String pTransmissao) {
		this.transmissao = pTransmissao;
	}
	
	@Override
	public String dadosFormatados() {
		//com o 'super.' pego o metodo da classe mae 'Usuario'
		String dadosVeiculo = super.dadosFormatados();
		String dadosMoto = String.format("Transmissao: %s ", this.transmissao);

		return dadosVeiculo + dadosMoto;
	}
	
	
	
	
}
