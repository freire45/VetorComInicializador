package br.com.erickfreire.vetorcominicializador;


/**
 * Programa em Java que inicializa um veotor.
 * @author Erick Freire
 * @version 1 - Criado em 20-05-2021 as 19:38
 */

public class VetorComInicializador {

	public static void main(String[] args) {
		
		int[] vetor = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.printf("%s%8s%n", "Index", "Valor");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%5d%8d%n", i, vetor[i]);
		}

	}

}
