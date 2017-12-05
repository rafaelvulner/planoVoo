package br.com.atech.voo.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.atech.voo.dominio.Voo;

public interface IVooRepositorio extends CrudRepository<Voo, Integer>{

 List<Voo> findAll();
}
