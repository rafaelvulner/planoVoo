package br.com.atech.voo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Piloto {

	@Id
	private int registro;

	private String nome;
	
	public Piloto(int registro, String nome){
		this.registro = registro;
		this.nome = nome;
	}
	
	public Piloto(){}
	
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + registro;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (registro != other.registro)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Registro: "+this.registro+", Nome: "+this.nome+"]";
	}

}
