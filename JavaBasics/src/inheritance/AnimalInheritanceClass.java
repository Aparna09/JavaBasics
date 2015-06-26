package inheritance;

public class AnimalInheritanceClass {

	public static void main(String[] args) {
		System.out.println("\n\tAnimal Lion" );

		Lion lion = new Lion("Lion King", 51, "Jungle");
		lion.setEat("Meat");
		lion.toString();
		System.out.println(lion.toString());

		Lion cub = new Lion("Zuri", 35, "Zoo") {

			@Override
			public String getEat() {
				
				return "Milk";
			}
			

		};
		System.out.println(cub.toString());

		 System.out.println("\n\tAnimal Horse");
		Horse horse = new Horse("Maple", 500, "Stable");
		horse.setEat("HayStack");
		horse.setAccessories("NoseBands");
		System.out.println(horse.toString());

	}

}
