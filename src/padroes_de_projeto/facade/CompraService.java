package padroes_de_projeto.facade;

//abstraindo o pacote service de compras
public class CompraService 
{
	
	public void salvarCompra(String nome, String isbn)
	{
		Livro livroCarregado = extrairDadosDoISBN(isbn);
		
		System.out.println("Salvando na base de dados a compra: ");
		System.out.println("Nome do cliente: "+ nome);
		System.out.println(livroCarregado.toString());
	}
	
	public static Livro extrairDadosDoISBN(String isbn)
	{
		Livro livroMock = new Livro("Cabeça fria, coração quente","Futebol", 408);
		return livroMock;
	}

}

