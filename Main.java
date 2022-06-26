import decorator.Dragon;
import decorator.Enemy;
import decorator.Monster;
import decorator.Undead;

public class Main {

	public static void main(String[] args) {
		
		Enemy boss  = new Dragon(new Undead(new Monster()));
		
		System.out.println("The Boss: ");
		System.out.println(boss.move());
		System.out.println("Attack damage: " + boss.attack());
		

	}

}
