package model;

public class Carro extends Veiculo {
	
	private int numPortas;
	
	
	public Carro(String marca, String modelo, int numPortas) {
		
		
		super(marca, modelo);
		this.numPortas=numPortas;
		
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	@Override
	public String dadosFormatados() {
		//com o 'super.' pego o metodo da classe mae 'Usuario'
		String dadosVeiculo = super.dadosFormatados();
		String dadosCarro = String.format("Numero portas %d ", this.numPortas);

		return dadosVeiculo + dadosCarro;
	}
	
	
}
