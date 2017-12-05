package br.com.atech.voo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
	public void saida(@RequestBody Voo voo, HttpServletResponse response) {

		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		voo.setStatus(Status.VOANDO);
		voo.setHoraPartida(dateFormat.format(Calendar.getInstance().getTime()));

		service.salvar(voo);

	}

	/**
	 * Rest para chegada do avião
	 * @param voo
	 */
	@RequestMapping(value = "/chegada", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void chegada(@RequestBody Voo voo) {		
		
		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");		
		voo.setHoraPartida(service.buscarVoo(voo).getHoraPartida());
		voo.setHoraChegada(dateFormat.format(Calendar.getInstance().getTime()));
		voo.setStatus(Status.PARADO);

		service.atualizar(voo);
	}

	/**
	 * Rest para buscar todos os voo
	 * @return
	 */
	@RequestMapping(value = "/buscarTodos", method = RequestMethod.GET, produces = "application/json")
	public List<Voo> buscarTodos() {

		return service.buscarTodos();
	}

	/**
	 * Rest para excluir um voo
	 * @param voo
	 */
	@RequestMapping(value = "/remover", method = RequestMethod.POST, produces = "application/json")
	public void remover(@RequestBody Voo voo) {

		service.remover(voo);
	}

}
