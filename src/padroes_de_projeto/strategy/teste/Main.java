package padroes_de_projeto.strategy.teste;

import padroes_de_projeto.strategy.Elfo;
import padroes_de_projeto.strategy.Guerreiro;
import padroes_de_projeto.strategy.Jogador;
import padroes_de_projeto.strategy.Mago;

public class Main 
{

	public static void main(String[] args)
	{
		Jogador elfo = new Elfo();
		Jogador guerreiro = new Guerreiro();
		Jogador mago = new Mago();
		
		
		realizarCombate(elfo, mago);
		
	}
	
	private static void realizarCombate(Jogador atacante, Jogador defensor)
	{
		System.out.println("Player1: "+atacante.atacar());
		System.out.println("Player2: "+defensor.defender());
	}
	

}
