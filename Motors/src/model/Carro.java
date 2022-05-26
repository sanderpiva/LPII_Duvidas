package model;

public class Carro extends Veiculo {
	
	private int numPortas;
	
	public Carro(String pMarca, String pModelo, int pNumPortas) {
		
		super(pMarca, pModelo);
		this.numPortas = pNumPortas;
		
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int pNumPortas) {
		this.numPortas = pNumPortas;
	}
	
	@Override
	public String dadosFormatados() {
		//com o 'super.' pego o metodo da classe mae 'Usuario'
		String dadosVeiculo = super.dadosFormatados();
		String dadosCarro = String.format("Numero portas %d ", this.numPortas);

		return dadosVeiculo + dadosCarro;
	}
	
	
}
