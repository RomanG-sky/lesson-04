package lgs.lviv.ua;

public class RobotDancer extends Robot {
	private String danceStyle;
	private double timeOfDance;

	public RobotDancer(String robotName, String categoryOfRobot, String model, String actions, String danceStyle,
			double timeOfDance) {
		super(robotName, categoryOfRobot, model, actions);
		this.danceStyle = danceStyle;
		this.timeOfDance = timeOfDance;
	}

	@Override
	public String toString() {
		return "RobotDancer [danceStyle=" + danceStyle + ", timeOfDance=" + timeOfDance + "]";
	}
	@Override
	void work() {
		System.out.println("I am a RobotDancer - I'm just dancing.");
	}

}
