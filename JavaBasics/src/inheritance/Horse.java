package inheritance;

public class Horse extends Animal {
	private String accessories;

	public Horse(String name, int speed, String home) {
		super(name, speed, home);

	}

	

	public String getAccessories() {
		return accessories;
	}

	public void setAccessories(String accessories) {
		this.accessories = accessories;
	}

	@Override
	public String toString() {

		return "\nMy name is " + getName() + ",\nand my speed : " + getSpeed()
				+ " Horse power" + " \nI like : carrots and " + getEat()
				+ ", \nI live in a : " + getHome()
				+ " \nand my favourite accessories  are " + getAccessories()
				+ "";
	}
}
