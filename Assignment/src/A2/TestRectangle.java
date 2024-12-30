package A2;
import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		double length = Sc.nextDouble();
		
		System.out.print("Enter width: ");
		double width = Sc.nextDouble();
		
		Rectangle newRectangle = new Rectangle();
		newRectangle.setLength(length);
		newRectangle.setWidth(width);
		
		newRectangle.getLength();
		
		System.out.println("");
		
		newRectangle.getWidth();
		
		System.out.println("Area: "+newRectangle.calculateArea());
		
		System.out.println("");
		
		System.out.println("Perimeter: "+newRectangle.calculatePerimeter());
		
		Sc.close();
	}
}