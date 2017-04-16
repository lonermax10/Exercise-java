import java.util.Scanner;

public class MinElementIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] list = new double[10];
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextDouble();
		}
		System.out.println("The minium index is : " + indexOfSmallestElement(list));
		input.close();
	}
	public static int indexOfSmallestElement(double[] array){
		double min = array[0];
		int indexOfMin = 0;
		for(int i = 1; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}

}
