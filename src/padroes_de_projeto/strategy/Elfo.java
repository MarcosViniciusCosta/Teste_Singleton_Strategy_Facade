package padroes_de_projeto.strategy;

public class Elfo implements Jogador {

	@Override
	public String atacar() {
		return "*Lançando saraivada de flechas*";
	}

	@Override
	public String defender() {
		return "*Esquivando*";
	}

}
