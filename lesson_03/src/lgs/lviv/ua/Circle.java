package lgs.lviv.ua;

public class Circle {
	private double radius;
	private double diametr;
	final double Pi = 3.1415926536;
	
	Circle(){
		this.setRadius(22.00);
		this.setDiametr(44.00);
	}
	double Cirlce_area() {
		return Pi * (getDiametr() / 2) * (getDiametr() / 2);
	}

	double Circle_lenght() {
		return 2 * Pi * getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}
	
}
