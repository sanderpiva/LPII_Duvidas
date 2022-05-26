package model;

public class Aluno extends PessoaFisica {
	
	private String RA;
	private String curso;
	
	public Aluno(String pNome, String pCPF, String pRG) {
		
		super(pNome, pCPF, pRG);
	}

	public String getRA() {
		return this.RA;
	}

	public void setRA(String pRA) {
		this.RA = pRA;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String pCurso) {
		this.curso = pCurso;
	}
	
	@Override
	public String formataDados() {
		String dadosPessoaFisica = super.formataDados();
		String dadosAluno = String.format("\nRA: %s \nCurso: %s", this.RA, this.curso);
		
		return dadosPessoaFisica+dadosAluno;
	}
	
}
