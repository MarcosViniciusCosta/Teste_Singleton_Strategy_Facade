package padroes_de_projeto.strategy;

public class Guerreiro implements Jogador{

	@Override
	public String atacar() {
		return "*Atacando com a espada*";
	}

	@Override
	public String defender() {
		return "*Bloqueando com o escudo*";
	}


}
