package atividades;

import java.util.Optional;

public class OptionalAtividade2 {
	private static String B() { 
		String x = "Optional no java"; 
		return x; 
	} 
	public static void main(String[] args) {
		
			//o optional Empty é para o objeto retornar vazio com ele conseguimos colocar em prática o orElse() que executa o B 					System.out.println(Optional.empty().orElse(B())); 
			//orElse só executa quando não houver valores para o optional
			System.out.println(Optional.empty().orElse(B()));
	
	}

}
