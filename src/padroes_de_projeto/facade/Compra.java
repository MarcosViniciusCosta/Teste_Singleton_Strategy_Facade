package padroes_de_projeto.facade;

import java.util.Scanner;

public class Compra {

	// abstraindo a injeção de dependência
	static String nome;
	static String isbn;
	static CompraService compraService = new CompraService();
	
	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu nome abaixo: ");
		nome = leia.nextLine();
		System.out.println("Digite o ISBN do livro: ");
		isbn = leia.nextLine();
		salvarCompra(nome, isbn);
		leia.close();
	}
	
	public static void salvarCompra(String nome, String isbn)
	{
		compraService.salvarCompra(nome,isbn);
	}

}
