package model;

import java.util.*;

public class Leilao {

	private String desc;
	private List<Lance> lances;

	public Leilao(String d) {

		desc=d;
		lances = new ArrayList<Lance>();

	}
	
	public List<Lance> getLances(){
		
		return lances;
	}
	
	public void adicionaLance(Lance lance) {
		
		lances.add(lance);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
