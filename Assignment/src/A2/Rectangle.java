package A2;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle (){
		this.length = 1;
		this.width = 1;		
	}
	
	public double calculatePerimeter (){
		return 2*(this.length+this.width);
	}
	
	public double calculateArea (){
		return this.length * this.width;
	}
	
	public void getLength() {
		System.out.println("Length: "+length);
	}

	public void getWidth() {
		System.out.println("Width: "+width);
	}

	public void setLength(double length) {
		if (length > 0.0 && length < 20.0) {
			this.length = length;			
		}
		else {
			System.out.println("Enter length between (0.0 - 20.0) !!");
			System.exit(0);
		}
	}

	public void setWidth(double width) {
		if (width > 0.0 && width < 20.0) {
			this.width = width;			
		}
		else {
			System.out.println("Enter width between (0.0 - 20.0) !!");
			System.exit(0);
		}
	}
}