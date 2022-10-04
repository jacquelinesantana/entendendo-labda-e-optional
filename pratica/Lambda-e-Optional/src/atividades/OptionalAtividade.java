package atividades;

import java.util.Optional;

public class OptionalAtividade {

	public static void main(String[] args) {
		//para um optional utilizamos 
		Optional<String> xz1 = Optional.of("Somos todes Devs");

		//equivale a xz1 = ("Somos todes Devs"), inserir o dado dentro de xz1
		String frase = xz1.get() ;
		System.out.println(xz1.get() );
		
		

	}

}
