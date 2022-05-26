package view;

import model.Aluno;
import model.Professor;
import model.Usuario;
import model.PessoaFisica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario us1 = new Usuario("Nome Padrao usuario", "End Padrao usuario", "RG Padrao usuario");
		System.out.println("Usuario");
		System.out.println(us1.formataDados());
		
		System.out.println("");
		PessoaFisica pf1 = new PessoaFisica("Nome Pessoa Fisica", "End Pessoa Fisica", "RG Pessoa Fisica");
		
		System.out.println("Pessoa fisica");
		System.out.println(pf1.formataDados());
		
		System.out.println("");
		Professor p1 = new Professor("Lia", "rua Florida", "123A");
		p1.setCpf("456.1");
		p1.setSiape("A400");
		p1.setCursoMinistrado("Biologia");
		System.out.println("Professor");
		System.out.println(p1.formataDados());
		System.out.println("");
		
		System.out.println("");
		Aluno a1 = new Aluno("Lucas", "rua Florida", "12A");
		a1.setNome("Aparecido");
		a1.setCpf("856.1");
		a1.setRA("IF300");
		a1.setCurso("Biologia");
		System.out.println("Aluno");
		System.out.println(a1.formataDados());
		System.out.println("");
		
	}

}
