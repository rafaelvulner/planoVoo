package br.com.atech.voo.domain;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + serie;
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
		Aviao other = (Aviao) obj;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (serie != other.serie)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Serie: "+this.serie+", Modelo: "+this.modelo+"]";
	}
	
	


}
