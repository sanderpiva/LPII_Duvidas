package view;

import model.Usuario;
import model.Carro;
import model.Leilao;
import model.Leiloeiro;
import model.Lance;
import model.Produto;
import model.Moto;

public class Main {
	
	public static void main(String[] a) {
		
		Usuario emerson = new Usuario("050");
		emerson.setNome("Emerson");
		

		Usuario maria = new Usuario("070");
		maria.setNome("Maria");
		

		Usuario joao = new Usuario("080");
		joao.setNome("Joao");
		
		Carro monza = new Carro("Carro");
		monza.setMarca("GM");
		monza.setModelo("Monza");
		
		Leilao leilao = new Leilao("Ferro Velho");
		Lance l1 = new Lance(100, emerson, monza, leilao);
		Lance l2 = new Lance(200, maria, monza, leilao);
		Lance l3 = new Lance(50, joao, monza, leilao);
		
		leilao.adicionaLance(l1);
		leilao.adicionaLance(l2);
		leilao.adicionaLance(l3);
		
		Leiloeiro otavio = new Leiloeiro(leilao);
		
		otavio.setNome("Otavio");
		otavio.vencedor();
		
		Lance lance = otavio.vencedor();
		
		System.out.println("Leilao "+ leilao.getDesc());
		System.out.println("Lance vencedor");
		System.out.println("Usuario: "+lance.getUsuario().getNome());
		
		System.out.println("Produto: "+lance.getProduto().informacoes());
		System.out.println("Valor "+lance.getValor());
		
		System.out.println(lance.getLeilao().getDesc());
		
		
		System.out.println("--");
		

		Usuario e1 = new Usuario("0502");
		e1.setNome("Edvaldo");
		

		Usuario e2 = new Usuario("0702");
		e2.setNome("Edvaldo Rui");
		

		Usuario e3 = new Usuario("0802");
		e3.setNome("Edvaldo Reis");
		
		Moto m1 = new Moto("Moto");
		m1.setMarca("Honda");
		m1.setModelo("CG500");

		
		Leilao leilao2 = new Leilao("Moto Velha");
		Lance l4 = new Lance(100, e1, m1, leilao2);
		Lance l5 = new Lance(200, e2, m1, leilao2);
		Lance l6 = new Lance(500, e3, m1, leilao2);
		
		leilao2.adicionaLance(l4);
		leilao2.adicionaLance(l5);
		leilao2.adicionaLance(l6);
		

		Leiloeiro otavio2 = new Leiloeiro(leilao2);
		
		otavio2.setNome("Otavio");
		otavio2.vencedor();
		
		Lance lanceMoto = otavio2.vencedor();
		
		System.out.println("Leilao "+ leilao2.getDesc());
		System.out.println("Lance vencedor");
		System.out.println("Usuario: "+lanceMoto.getUsuario().getNome());
		
		System.out.println("Produto: "+lanceMoto.getProduto().informacoes());
		System.out.println("Valor "+lanceMoto.getValor());
		
	}
}
