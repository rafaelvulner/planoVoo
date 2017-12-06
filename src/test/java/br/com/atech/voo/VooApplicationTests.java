package br.com.atech.voo;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.atech.voo.controller.VooController;
import br.com.atech.voo.entidade.Aviao;
import br.com.atech.voo.entidade.Piloto;
import br.com.atech.voo.entidade.Status;
import br.com.atech.voo.entidade.Voo;
import br.com.atech.voo.servico.VooService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VooApplicationTests {

	@InjectMocks
	private VooController controller;
	
	@Mock
    private VooService service;

	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void retornarTodosOsVoo() {
	
		controller.buscarTodos();
        
        verify(service).buscarTodos();
	}
	
	@Test
	public void saidaDeVoo(){
		
		Voo voo = new Voo();
		Aviao aviao = new Aviao();
		Piloto piloto = new Piloto();
		
		aviao.setSerie(1);
		aviao.setModelo("Phenom");
		
		piloto.setRegistro(1);
		piloto.setNome("Junior");
		
		voo.setCod(40);
		voo.setCidadeDestino("Aruja");
		voo.setCidadeOrigem("Nordeste");		
		voo.setHoraPartida("01:00");
		voo.setStatus(Status.VOANDO);
		voo.setAviao(aviao);
		voo.setPiloto(piloto);
		
		controller.saida(voo);

        verify(service).salvar(any(Voo.class));
		
		
	}
	
	@Test
	public void excluirVoo(){
		controller.remover(any(Voo.class));
		
		verify(service).remover(any(Voo.class));
		
	}
	}
		
		
