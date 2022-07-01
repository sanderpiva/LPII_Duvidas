package model;
import java.util.*;

public class Lance {
	
	private double valor;
	private Date data;
	private Usuario usuario;
	private Produto produto;
	private Leilao leilao;
	
	public Lance(double v, Usuario u, Produto p, Leilao l) {
		
		valor = v;
		usuario=u;
		produto=p;
		leilao=l;
		
	}

	public double getValor() {
		return valor;
	}

	public Date getData() {
		return data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Produto getProduto() {
		return produto;
	}

	public Leilao getLeilao() {
		return leilao;
	}
	
	
}
