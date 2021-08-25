package lgs.lviv.ua;

public class Robot {

	private String robotName;
	private String categoryOfRobot;
	private String model;
	private String actions;

	Robot(String robotName, String categoryOfRobot, String model, String actions) {
		this.robotName = robotName;
		this.categoryOfRobot = categoryOfRobot;
		this.model = model;
		this.actions = actions;
	}
	
	void work() {
		System.out.println("I am a Robot - I'm just working.");
	}

	String Work() {
		return "I am a " + getRobotName() + " - " + getActions() + ".";
	}

	@Override
	public String toString() {
		return "Robot [robotName=" + robotName + ", categoryOfRobot=" + categoryOfRobot + ", model=" + model
				+ ", actions=" + actions + "]";
	}

	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public String getCategoryOfRobot() {
		return categoryOfRobot;
	}

	public void setCategoryOfRobot(String categoryOfRobot) {
		this.categoryOfRobot = categoryOfRobot;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getActions() {
		return actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

}
