package atividades;

import java.util.Optional;

public class OptionalAtividade2 {
	private static String B() { 
		String x = "Optional no java"; 
		return x; 
	} 
	public static void main(String[] args) {
		
			//o optional Empty � para o objeto retornar vazio com ele conseguimos colocar em pr�tica o orElse() que executa o B 					System.out.println(Optional.empty().orElse(B())); 
			//orElse s� executa quando n�o houver valores para o optional
			System.out.println(Optional.empty().orElse(B()));
	
	}

}
