package fcu.iecs.oop.pokemon;

public abstract class Charmander extends Pokemon implements Fightable {
	
	Charmander(String nickName,PokemonType type,int cp) {
		super(nickName, type, cp);
	}
	@Override
	public void attack() {
		System.out.println("Aqua Tail¡K");		
	}
}
