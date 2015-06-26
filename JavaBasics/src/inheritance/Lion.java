package inheritance;

public class Lion extends Animal {

	public Lion(String name, int speed, String home) {
		super(name, speed, home);

	}

	
	

	@Override
	public String toString() {

		return "\nMy name is : " + getName() + ", \nSpeed " + getSpeed()
				+ " mph," + "\nI like :  " + getEat() + ", \nHome " + getHome() + "";
	}

}
