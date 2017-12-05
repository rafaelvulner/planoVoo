package br.com.atech.voo.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Piloto {

	@Id
	private int registro;

	private String nome;
	
	
	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
