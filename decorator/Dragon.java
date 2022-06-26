package decorator;

public class Dragon extends MonsterType{

	public Dragon(Enemy newEnemy) {
		super(newEnemy);
	}
	
	public double attack() {
		return myEnemy.attack() + 5.5;
	}
	
	public String move() {
		return myEnemy.move() + " flying";
	}
	
}
