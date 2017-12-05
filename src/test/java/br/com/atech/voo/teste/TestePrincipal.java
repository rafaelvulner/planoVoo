package br.com.atech.voo.teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestePrincipal {	
	

	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Date c = new Date();
		
		System.out.println(dateFormat.format(c));
		
		
		
		

	}

}
