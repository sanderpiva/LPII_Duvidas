package model;

public class Professor extends PessoaFisica {
	
	private String siape;
	private String cursoMinistrado;
	
	public Professor(String pNome, String pEndereco, String pRG) {
		
		super(pNome, pEndereco, pRG);
	}

	public String getSiape() {
		return this.siape;
	}

	public void setSiape(String pSiape) {
		this.siape = pSiape;
	}

	public String getCursoMinistrado() {
		return this.cursoMinistrado;
	}

	public void setCursoMinistrado(String pCursoMinistrado) {
		this.cursoMinistrado = pCursoMinistrado;
	}
	
	
	@Override
	public String formataDados() {
		String dadosPessoaFisica = super.formataDados();
		String dadosProfessor = String.format("\nSiape: %s \nCurso ministrado: %s", this.siape, this.cursoMinistrado);
		
		return dadosPessoaFisica+dadosProfessor;
	}
}
