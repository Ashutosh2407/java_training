import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements in the array");
		int length = sc.nextInt();
		int[] values = new int[length];
		System.out.println("Please enter the elements in the array");
		for(int i = 0; i < length; i++) {
			values[i] = sc.nextInt();
		}
		for(int i = 0; i < length; i++) {
			System.out.print(values[i] + " ");
		}
		int val = secondSmallest(values);
		System.out.println("The second smallest number is "+val);
	}
	
	public static int secondSmallest(int[] values) {
		for(int i =0; i < values.length-1;i++) {
			for(int j = i+1;j < values.length; j++) {
				if(values[i] > values[j]) {
					int temp = values[j];
					values[j] = values[i];
					values[i] = temp;
				}
			}
		}
		return values[1];
	}
	
	
	
	
}


