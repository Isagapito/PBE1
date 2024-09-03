package prjPokemon;

public class AplicacaoPokemon {

	public static void main(String[] args) {
		ClassePokemon picaku = new ClassePokemon ("Picaku", "eletrico", 2, 12);
		ClassePokemon bulbasaur = new ClassePokemon ("bulbasaur", "planta", 2, 12);
		ClassePokemon charmander = new ClassePokemon ("chamander", "fogo", 2, 12);
		ClassePokemon mimikyu = new ClassePokemon ("mimikyu", "fada", 2, 12);
		ClassePokemon oddish = new ClassePokemon ("oddish", "planta", 2, 12);

		picaku.exibirInfo();
		picaku.Atacar();
		picaku.Evoluir();
		
		bulbasaur.exibirInfo();
		bulbasaur.Atacar();
		bulbasaur.Evoluir();
		
		charmander.exibirInfo();
		charmander.Atacar();
		charmander.Evoluir();
		
		mimikyu.exibirInfo();
		mimikyu.Atacar();
		mimikyu.Evoluir();
		
		oddish.exibirInfo();
		oddish.Atacar();
		oddish.Evoluir();
		
	}
	}


