package br.com.atech.voo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Voo {
	
	@Id	
	private int cod;
	
	private String horaPartida;
	
	private String horaChegada;
	
	private String cidadeOrigem;
	
	private String cidadeDestino;
	
	private Status status;		

	@OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
	private Aviao aviao;
	
	@OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH,CascadeType.DETACH})
	private Piloto piloto;	
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(String date) {
		this.horaPartida = date;
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	
	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aviao == null) ? 0 : aviao.hashCode());
		result = prime * result + ((cidadeDestino == null) ? 0 : cidadeDestino.hashCode());
		result = prime * result + ((cidadeOrigem == null) ? 0 : cidadeOrigem.hashCode());
		result = prime * result + cod;
		result = prime * result + ((horaChegada == null) ? 0 : horaChegada.hashCode());
		result = prime * result + ((horaPartida == null) ? 0 : horaPartida.hashCode());
		result = prime * result + ((piloto == null) ? 0 : piloto.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Voo other = (Voo) obj;
		if (aviao == null) {
			if (other.aviao != null)
				return false;
		} else if (!aviao.equals(other.aviao))
			return false;
		if (cidadeDestino == null) {
			if (other.cidadeDestino != null)
				return false;
		} else if (!cidadeDestino.equals(other.cidadeDestino))
			return false;
		if (cidadeOrigem == null) {
			if (other.cidadeOrigem != null)
				return false;
		} else if (!cidadeOrigem.equals(other.cidadeOrigem))
			return false;
		if (cod != other.cod)
			return false;
		if (horaChegada == null) {
			if (other.horaChegada != null)
				return false;
		} else if (!horaChegada.equals(other.horaChegada))
			return false;
		if (horaPartida == null) {
			if (other.horaPartida != null)
				return false;
		} else if (!horaPartida.equals(other.horaPartida))
			return false;
		if (piloto == null) {
			if (other.piloto != null)
				return false;
		} else if (!piloto.equals(other.piloto))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	

	

	
	
	
	

}
