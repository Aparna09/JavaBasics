package inheritance;

public class Animal {

	private String name;
	private int speed;
	private String eat;
	private String Home;

	public Animal(String name, int speed, String home) {

		this.name = name;
		this.speed = speed;
		Home = home;
	}

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public String getHome() {
		return Home;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String toString() {
		return "name " + name + ", speed " + speed + ", eat " + eat + ", Home "
				+ Home + "";
	}

}
