package br.com.dio;

import br.com.dio.model.Cachorro;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Livros livro = new Livros();
		
		cachorro.setNome("caramelo");
		System.out.println(cachorro);
		System.out.println(cachorro.getNome());
		
	}

}

class Livros{
	private String nome;
	private String npag;
	
}