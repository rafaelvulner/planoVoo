package br.com.atech.voo.teste;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import br.com.atech.voo.domain.Piloto;

public class TestePrincipal {	
	

	public static void main(String[] args) {

		
		Set<Piloto> list = new LinkedHashSet<Piloto>();
		
		list.add(new Piloto(123, "Alfredo"));
		list.add(new Piloto(1234, "Mariana"));
		list.add(new Piloto(12345, "Carlos"));
		list.add(new Piloto(123456, "Julia"));
		
		list.forEach(System.out::println);
		
		Optional<Piloto> retorno = list.stream().filter(p -> p.getNome() == "Carlos")
		.findFirst();
		
		System.out.println(retorno.get());
		
	}

}
