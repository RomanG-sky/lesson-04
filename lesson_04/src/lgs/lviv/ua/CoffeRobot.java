package lgs.lviv.ua;

public class CoffeRobot extends Robot {
	private String typeOfCoffe;
	private int cupsOfCoffe;

	public CoffeRobot(String robotName, String categoryOfRobot, String model, String actions, String typeOfCoffe,
			int cupsOfCoffe) {
		super(robotName, categoryOfRobot, model, actions);
		this.typeOfCoffe = typeOfCoffe;
		this.cupsOfCoffe = cupsOfCoffe;
	}

	@Override
	public String toString() {
		return "CoffeRobot [typeOfCoffe=" + typeOfCoffe + ", cupsOfCoffe=" + cupsOfCoffe + ", Work()=" + Work()
				+ ", toString()=" + super.toString() + ", getRobotName()=" + getRobotName() + ", getCategoryOfRobot()="
				+ getCategoryOfRobot() + ", getModel()=" + getModel() + ", getActions()=" + getActions()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	@Override
	void work() {
		System.out.println("I am a CoffeRobot - I can make coffee.");
	}
}
