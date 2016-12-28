package fcu.iecs.oop.pokemon;

public abstract class Psyduck extends Pokemon implements Fightable{
	
	Psyduck(String nickName,PokemonType type,int cp) {
		super(nickName,type,cp);
	}
	@Override
	public void attack() {
		System.out.println("Ember¡K");		

	}
}
