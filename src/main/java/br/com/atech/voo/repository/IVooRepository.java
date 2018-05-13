package br.com.atech.voo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.atech.voo.domain.Voo;

public interface IVooRepository extends CrudRepository<Voo, Integer>{

 List<Voo> findAll();
}
