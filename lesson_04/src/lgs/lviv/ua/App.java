package lgs.lviv.ua;

public class App {

	public static void main(String[] args) {

		CoffeRobot Coffee = new CoffeRobot("CoffeRobot", "KitchenMashine", "Delongi", "I can make coffee", "Fletwhite",
				10);
		RobotDancer Disco = new RobotDancer("RobotDancer", "RelaxMashine", "Sony", " I'm just dancing", "Rumba", 2.30);
		RobotCoocker Cheff = new RobotCoocker("RobotCoocker", "KitchenMashine", "Moulinex", "I'm jusk cooking",
				"Varenyky", 60.00);
		Robot Sonic = new Robot("Robot", "HelpMachine", "Hitachi", "I'm just working");

		System.out.println(Coffee.Work());
		System.out.println(Disco.Work());
		System.out.println(Cheff.Work());
		System.out.println(Sonic.Work());
		
		System.out.println(" ");

		String[] Robotex = { "CoffeRobot", "KitchenMashine", "Delongi", "I can make coffee", "Fletwhite", "10",
				"RobotDancer", "RelaxMashine", "Sony", "I'm just dancing", "Rumba", "2.30", "RobotCoocker",
				"KitchenMashine", "Moulinex", "I'm jusk cooking", "Varenyky", "60.00", "Robot", "HelpMachine",
				"Hitachi", "I'm just working" };
		for (int i = 0; i < Robotex.length; i++) {
			System.out.println(Robotex[i]);
			}
		System.out.println(" ");
		// Vnis korektyvy v zavdannya)
		Robot [] arr = {Coffee,Disco,Cheff,Sonic};
		for (int i = 0; i < arr.length; i++) {
			Robot b = arr[i];
			b.work();
		}
		System.out.println(" ");
		// Zoo
		Animal first = new Animal("Leopard", 20, 7);
		
		System.out.println(first);
		//or
		System.out.println("Nazva tvaryny - " + first.getAnimalName() + ", shvydkist tvaryny - "
				+ first.getAnimalSpeed() + ", vik tvaryny - " + first.getAnimalAge() + ".");
		
		first.setAnimalName("Bear");
		first.setAnimalSpeed(2);
		first.setAnimalAge(14);

		System.out.println(first);

	}


}
