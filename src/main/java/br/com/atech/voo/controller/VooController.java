package br.com.atech.voo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.atech.voo.domain.Status;
import br.com.atech.voo.domain.Voo;
import br.com.atech.voo.service.VooService;

@RestController
public class VooController {

	@Autowired
	private VooService service;

	/**
	 * Rest Exit in the voo
	 * @param voo
	 * @param response
	 */
	@RequestMapping(value = "/exit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void exit(@RequestBody Voo voo) {		
		
		LocalDateTime hour = LocalDateTime.now();		
		
		voo.setStatus(Status.VOANDO);		
		
		voo.setHoraPartida(hour.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		service.save(voo);

	}

	/**
	 * Rest to check-in one voo
	 * @param voo
	 */
	@RequestMapping(value = "/checkIn", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void checkIn(@RequestBody Voo voo) {		
		
		LocalDateTime hour = LocalDateTime.now();		
		
		voo.setHoraPartida(service.findOne(voo).getHoraPartida());		
		
		voo.setHoraChegada(hour.format(DateTimeFormatter.ofPattern("HH:mm:ss")));		
		
		voo.setStatus(Status.PARADO);		
		
		service.update(voo);
	}

	/**
	 * Rest to find all voo
	 * @return
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public List<Voo> getAll() {		
		
		return service.findAll();
	}

	/**
	 * Rest to delete one voo
	 * @param voo
	 */
	@RequestMapping(value = "/remove", method = RequestMethod.DELETE, produces = "application/json")
	public void remove(@RequestBody Voo voo) {
		
		service.remove(voo);
	}

}
