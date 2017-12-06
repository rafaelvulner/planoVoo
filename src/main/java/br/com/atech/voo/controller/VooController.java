package br.com.atech.voo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.atech.voo.entidade.Status;
import br.com.atech.voo.entidade.Voo;
import br.com.atech.voo.servico.VooService;

@RestController
public class VooController {

	@Autowired
	private VooService service;

	/**
	 * Rest saida do avião
	 * @param voo
	 * @param response
	 */
	@RequestMapping(value = "/saida", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saida(@RequestBody Voo voo) {
		//FORMATA AS HORAS NO FORMATO SIMPLES
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		//SETA O ESTADO DO AVIÃO QUANDO ELE PARTE
		voo.setStatus(Status.VOANDO);
		
		//SETA O HORARIO DE PARTIDA
		voo.setHoraPartida(dateFormat.format(Calendar.getInstance().getTime()));

		//SALVA NA BASE 
		service.salvar(voo);

	}

	/**
	 * Rest para chegada do avião
	 * @param voo
	 */
	@RequestMapping(value = "/chegada", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void chegada(@RequestBody Voo voo) {				
		
		//FORMATA AS HORAS NO FORMATO SIMPLES
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");	
		
		//BUSCA O HORARIO QUE O AVIÃO PARTIU PARA ATUALIZAR A TABELA COM HORARIO DE PARTIDA E CHEGADA
		voo.setHoraPartida(service.buscarVoo(voo).getHoraPartida());
		
		//SETA A HORA DE CHEGADA DO AVIÃO 
		voo.setHoraChegada(dateFormat.format(Calendar.getInstance().getTime()));
		
		//SETA O ESTADO EM QUE O AVIÃO SE ENCONTRA
		voo.setStatus(Status.PARADO);
		
		//ATUALIZA NA BASE DE DADOS
		service.atualizar(voo);
	}

	/**
	 * Rest para buscar todos os voo
	 * @return
	 */
	@RequestMapping(value = "/buscarTodos", method = RequestMethod.GET, produces = "application/json")
	public List<Voo> buscarTodos() {
		
		//RETORNA UMA LISTA COM TODOS OS VOO
		return service.buscarTodos();
	}

	/**
	 * Rest para excluir um voo
	 * @param voo
	 */
	@RequestMapping(value = "/remover", method = RequestMethod.DELETE, produces = "application/json")
	public void remover(@RequestBody Voo voo) {
		
		//REMOVE UM VOO
		service.remover(voo);
	}

}
