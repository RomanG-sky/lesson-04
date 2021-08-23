package lgs.lviv.ua;

public class Geometry {

	public static void main(String[] args) {

		Rectangle R1 = new Rectangle();
		R1.setLenght(5);
		R1.setWight(8);
		System.out.println("Прямокутник без параметрів ");
		System.out.println("Площа прямокутника = " + R1.Area());
		System.out.println("Периметр прямокутника = " + R1.Perimeter());

		System.out.println();

		Rectangle R2 = new Rectangle();
		System.out.println("Прямокутник з параметрами ");
		System.out.println("Площа прямокутника = " + R2.Area());
		System.out.println("Периметр прямокутника = " + R2.Perimeter());

		System.out.println();

		Circle O = new Circle();
		O.setRadius(8);
		O.setDiametr(16);
		System.out.println("Коло без параметрів ");
		System.out.println("Площа кола = " + O.Cirlce_area());
		O.Circle_lenght();
		System.out.println("Довжина кола = " + O.Circle_lenght());

		System.out.println();

		Circle P = new Circle();
		System.out.println("Коло із параметрами ");
		System.out.println("Площа кола = " + P.Cirlce_area());
		P.Circle_lenght();
		System.out.println("Довжина кола = " + P.Circle_lenght());

	}

}
