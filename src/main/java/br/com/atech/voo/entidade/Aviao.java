package br.com.atech.voo.entidade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aviao {
	
	@Id
	private String modelo;	
	
	private int serie;	

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	


}
