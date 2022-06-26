package decorator;

public abstract class MonsterType implements Enemy{

	protected Enemy myEnemy;
	
	public MonsterType (Enemy newEnemy) {
		this.myEnemy = newEnemy;
	}
	
	public double attack() {
		return myEnemy.attack();
	}
	
	public String move() {
		return myEnemy.move();
	}
	
}
