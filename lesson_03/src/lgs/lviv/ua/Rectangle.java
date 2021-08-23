package lgs.lviv.ua;

public class Rectangle {
private double lenght;
private double wight;
Rectangle(){
	this.setLenght(22.00);
	this.setWight(11.00);
};

double Area() {
return getLenght()*getWight();
}
double Perimeter() {
	return 2*getLenght()+2*getWight();
}

public double getLenght() {
	return lenght;
}

public void setLenght(double lenght) {
	this.lenght = lenght;
}

public double getWight() {
	return wight;
}

public void setWight(double wight) {
	this.wight = wight;
}
}
