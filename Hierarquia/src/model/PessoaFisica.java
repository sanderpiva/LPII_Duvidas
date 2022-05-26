package model;

public class PessoaFisica extends Usuario {
	
	private String cpf;
	
	public PessoaFisica(String pNome, String pEndereco, String pRG) {
		
		super(pNome, pEndereco, pRG);
		this.cpf = "CPF Padrao Pessoa Fisica";
		
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String pCpf) {
		this.cpf = pCpf;
	}

	
	@Override
	public String formataDados() {
		String dadosUsuario = super.formataDados();
		String dadosPessoaFisica = String.format("\nCPF: %s ", this.cpf);
		
		return dadosUsuario+dadosPessoaFisica;
	}
	
	
	
}
