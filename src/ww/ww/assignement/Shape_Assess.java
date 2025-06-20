package ww.ww.assignement;

class CalculateArea{
	
	public static  int length=20;
	public static int breadth=30;
	public static final float pie=(float) 3.14;
	public static int radius=4;
	


class Rectangle extends CalculateArea{
	static void display() {

		int calculate=length*breadth;
		System.out.println(calculate);
		
	}
	
}


class Circel extends CalculateArea{
	static void display1() {
		
		float area=(float) (pie*(radius*radius));
		System.out.println(area);
	}
	
}


public class Shape_Assess {

	public static void main(String[] args) {
		
Rectangle.display();
Circel.display1();
	}

}
