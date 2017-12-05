package br.com.atech.voo.entidade;

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

	@OneToOne(cascade = CascadeType.ALL)
	private Aviao aviao;
	
	@OneToOne(cascade = CascadeType.ALL)
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

	

	
	
	
	

}
