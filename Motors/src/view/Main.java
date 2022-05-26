package view;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("\nVeiculo antes do construtor\n");
		Veiculo v1 = new Veiculo("Honda", "Civic");
		System.out.println("Marca: "+v1.getMarca()+" \nModelo: "+v1.getModelo());
		System.out.println("\nVeiculo com marca e modelo setados: ");
		v1.setMarca("Ford");
		v1.setModelo("Ka");
		System.out.println(v1.dadosFormatados());
		
		
		System.out.println("Carro");
		Carro c1 = new Carro("VW", "Up", 4);
		System.out.println(c1.dadosFormatados());
		
		System.out.println("");
		
		System.out.println("Moto");
		Moto m1 = new Moto("Yamaha", "Titan", "1500cc");
		System.out.println(m1.dadosFormatados());
		
	}

}
