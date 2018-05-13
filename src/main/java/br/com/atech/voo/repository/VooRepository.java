package br.com.atech.voo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.atech.voo.domain.Voo;

@Repository
public class VooRepository {

	@Autowired
	private IVooRepository dao;

	public void save(Voo voo) {
		dao.save(voo);
	}

	public void update(Voo voo) {
		dao.save(voo);
	}

	public List<Voo> findAll() {
		return dao.findAll();
	}

	public void remove(Voo voo) {
		dao.delete(voo.getCod());
	}
	
	public Voo findOne(Voo voo){			
	
		return dao.findOne(voo.getCod());
	}

}
