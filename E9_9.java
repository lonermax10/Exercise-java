package Section_9;

public class E9_9 {
	public static void main(String[] args) {
		RegularPolygon R1 = new RegularPolygon(); 
		System.out.println("周长是: " + R1.getPerimeter() + " ,"+ "面积是： " + R1.getArea() + " .");
		RegularPolygon R2 = new RegularPolygon(6,4);
		System.out.println("周长是: " + R2.getPerimeter() + " ,"+ "面积是： " + R2.getArea() + " .");
		RegularPolygon R3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("周长是: " + R3.getPerimeter() + " ,"+ "面积是： " + R3.getArea() + " .");
	}

}

class RegularPolygon{
	private int n = 3;
	private double side = 1;
	private double x;
	private double y;
	
	public RegularPolygon(){
		
	}
	public RegularPolygon(int number,double newSide){
		n = number;
		side = newSide;
	}
	public RegularPolygon(int number,double newSide,double newX,double newY){
		n = number;
		side = newSide;
		x = newX;
		y = newY;
	}
	public int getN(){
		return n;
	}
	public void setN(int newN){
		n = newN;
	}
	public double getSide(){
		return side;
	}
	public void setSide(double newSide){
		side = newSide;
	}
	public double getX(){
		return x;
	}
	public void setX(double newX){
		x = newX;
	}
	public double getY(){
		return y;
	}
	public void set(double newY){
		y = newY;
	}
	
	public double getPerimeter(){
		return n*side;
	}
	public double getArea(){
		return (n * side * side)/(4 * Math.tan(Math.PI / n));
	}
		
}
