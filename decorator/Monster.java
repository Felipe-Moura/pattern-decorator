package decorator;

public class Monster implements Enemy{
	
	@Override
	public double attack() {
		return 10.0;
	}

	@Override
	public String move() {
		return "Moved forward";
	}	
	
}
