package lgs.lviv.ua;

public class RobotCoocker extends Robot {
	private String nameOfDish;
	private double timeOfcooking;
	public RobotCoocker(String robotName, String categoryOfRobot, String model, String actions, String nameOfDish,
			double timeOfcooking) {
		super(robotName, categoryOfRobot, model, actions);
		this.nameOfDish = nameOfDish;
		this.timeOfcooking = timeOfcooking;
	}
	@Override
	public String toString() {
		return "RobotCoocker [nameOfDish=" + nameOfDish + ", timeOfcooking=" + timeOfcooking + "]";
	}
	@Override
	void work() {
		System.out.println("I am a RobotCoocker - RobotCoocker.");
	}

}
