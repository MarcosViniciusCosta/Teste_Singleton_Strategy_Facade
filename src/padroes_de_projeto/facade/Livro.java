package padroes_de_projeto.facade;

public class Livro 
{
	
	String tituloLivro;
	String categoria;
	int quantidadePaginas;
	
	public Livro(String tituloLivro, String categoria, int quantidadePaginas)
	{
		
		this.tituloLivro = tituloLivro;
		this.categoria = categoria;
		this.quantidadePaginas = quantidadePaginas;
	}
	
	public String toString()
	{
		
		return "Titulo do livro: "+ tituloLivro + "\n"
				+"Categoria do livro: " + categoria + "\n"
				+"Quantidade de páginas: " + quantidadePaginas+"\n";
	}
}
