package decorator;

public class Undead extends MonsterType{

	public Undead(Enemy newEnemy) {
		super(newEnemy);
	}
	
	public double attack() {
		return myEnemy.attack() + 3.5;
	}
	
	public String move() {
		return myEnemy.move() + " slowly";
	}

}
