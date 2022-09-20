package padroes_de_projeto.strategy;

public class Mago implements Jogador{

	@Override
	public String atacar() {
		return "*Lançando magia de ataque*";
	}

	@Override
	public String defender() {
		return "*Lançando magia de defesa*";
	}

}
