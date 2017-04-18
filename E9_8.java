package Section_9;

public class E9_8 {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());
		
		Fan fan2 = new Fan();
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("Blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());
	}

}
class Fan{
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan(){
	}
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}
	public boolean isOn(){
		return on;
	}
	public void setOn(boolean trueOrFalse){
		this.on = trueOrFalse;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newRadius){
		radius = newRadius;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	
	public String toString(){
		return "speed" + speed + "\n"
				+ "color" + color + "\n"
				+ "radius" + radius + "\n"
				+((on)? "fan is on" : "fan is off");
	}
	
}
