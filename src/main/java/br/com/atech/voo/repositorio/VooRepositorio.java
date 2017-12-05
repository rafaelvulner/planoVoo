package br.com.atech.voo.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.atech.voo.dominio.Voo;

@Repository
public class VooRepositorio {

	@Autowired
	private IVooRepositorio dao;

	public void salvar(Voo voo) {
		dao.save(voo);
	}

	public void atualizar(Voo voo) {
		dao.save(voo);
	}

	public List<Voo> buscarTodos() {
		return dao.findAll();
	}

	public void remover(Voo voo) {
		dao.delete(voo);
	}
	
	public Voo buscarVoo(Voo voo){			
	
		return dao.findOne(voo.getCod());
	}

}
