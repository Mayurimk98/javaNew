import java.util.Scanner;

public class conditionalStatements {

	public static void main(String[] args) {
		// If else statement

		// If will check all conditions whether it is true or false

//		int x = 15;
//		if (x > 10) {
//			System.out.println("X is greater than 10");
//		}
//		if (x == 15) {
//			System.out.println("X is equal to 15");
//		}
//		if (x < 0) {
//			System.out.println("X is less than 0");
//		}

		// ===========================================================

//		Scanner game = new Scanner(System.in);
//		int ticketNumber = game.nextInt();
//		if (ticketNumber < 10 && ticketNumber != 0) {
//			System.out.println("10% discount");
//		}
//		if (ticketNumber > 10) {
//			System.out.println("20 % discount");
//		}
//		if (ticketNumber == 0) {
//			System.out.println("Please select at least 1 ticket");
//		}
		// ===========================================================

//		int a = 10;
//		if (a == 10) {
//			System.out.println("Hello...");
//		} else {
//			System.out.println("Bye....");
//		}
		// ===========================================================

//		int var1 = 6;
//		int var2 = 5;
//		if ((var2 = 1) == var1) {
//			System.out.println(var2);
//		} else {
//			System.out.println(var2 + 1);
//
//		}
		// ===========================================================

		Scanner S = new Scanner(System.in);
		char alpha = S.next().charAt(0);
		if (alpha >= 'A' && alpha <= 'Z') {
			System.out.println(1);
		} else if (alpha >= 'a' && alpha <= 'z') {
			System.out.println(0);
		} else {
			System.out.println(-1);
		}

	}
}