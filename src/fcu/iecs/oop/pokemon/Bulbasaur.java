package fcu.iecs.oop.pokemon;

public abstract class Bulbasaur extends Pokemon implements Fightable{
	
	Bulbasaur(String nickName,PokemonType type,int cp) {
		super(nickName,type,cp);
	}
	@Override
	public void attack() {
		System.out.println("Tackle¡K");	
	}
}
