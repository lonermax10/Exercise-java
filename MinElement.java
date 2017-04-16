import java.util.Scanner;

public class MinElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arrayOfMin = new double[10]; 
		System.out.print("Enter ten numbers : ");
		
		for(int i = 0; i < arrayOfMin.length; i++){
			arrayOfMin[i] = input.nextDouble();
		}
		
		System.out.println("The minimum number is: " + min(arrayOfMin));
			
	}
	
	public static double min(double[] array){
		double min = array[0];
		for(int i = 1; i < array.length; i++)
			if(min > array[i])
				min = array[i];
		return min;
		
 }
}

