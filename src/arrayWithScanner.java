import java.util.Scanner;

public class arrayWithScanner {

	public static void main(String[] args) {

		// to decide size of array
		System.out.println("Please enter the required size of array");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int arr[] = new int[size];

		// to take input from user
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter " + i + " th index element of array");
			arr[i] = input.nextInt();
		}

		// to print the input which are taken from user
		System.out.println("Array elements are :");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

		// make the sum of all array element and print output
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of all array element is " + sum);

		// find out the largest element from array
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max number from array is "+ max);

	}
}
