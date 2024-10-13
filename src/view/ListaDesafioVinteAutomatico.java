package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListaDesafioVinteAutomatico {
	/*
	 DESAFIO 
Crie uma lógica que preencha uma lista de 20 posições com números aleatórios (entre 0 e 99) gerados pelo computador. 
Logo em seguida, mostre os números gerados e depois coloque a lista em ordem crescente, mostrando no final os valores ordenados.
	 
	 */
	public static void main(String[] args) {
		Random r = new Random();
		
		List<Integer> numerosAleatorios = new ArrayList<Integer>(20);
		// 20 posições alimenta
		
		for(int i=0; i < 20; i++) {
			int n = r.nextInt(98)+1;
			numerosAleatorios.add(n);
			//mais simles
			/*
			 *  numerosAleatorios.add(r.nextInt(100);
			 */
		}
		
		// mostra lista
		
		System.out.println(" Lista: " + numerosAleatorios);
		
		// ordena lista menor para maior.
		
		Collections.sort(numerosAleatorios);
		
		// mostra lista ordenada
		
		System.out.println("Lista ordenada e numeros, foi: " + numerosAleatorios);
	/* redudante
		for (Integer integer : numerosAleatorios) {
			System.out.println("Numeros ordenados" + integer + " ");
		}*/
	}
}
