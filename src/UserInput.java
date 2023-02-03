import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		/*
		 * // with the help of predefine value calculate the SI 
		 * int p = 100;
		 * int r = 12;
		 * int t = 3; 
		 * float SI = (p * r * t) / 100;
		 * System.out.println(SI);
		 * // with the help of user input (accept inpus from user) 
		 * Scanner Scan = new Scanner(System.in);
		 * System.out.println("Please enter Principle value");
		 * int principle = Scan.nextInt();
		 * System.out.println("Please enter rate value");
		 * int rate = Scan.nextInt();
		 * System.out.println("Please enter time value");
		 * int time = Scan.nextInt();
		 * System.out.println("Principle value is " + principle);
		 * System.out.println("rate value is " + rate);
		 * System.out.println("time value is " + time);
		 * float simpleInterest = (principle * rate* time) / 100;
		 * System.out.println("Calculated simple interset is "+ simpleInterest);
		 */
		calculateSimpleInterset();
		System.out.println("=========================================");
		calculateCompoundInterest();
	}

	public static void calculateSimpleInterset() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter SI principle value ");
		int p1 = userInput.nextInt();
		System.out.println("Please enter SI rate value ");
		int r1 = userInput.nextInt();
		System.out.println("Please enter SI time value ");
		int t1 = userInput.nextInt();
		double sI = (p1 * r1 * t1) / 100;
		System.out.println("Calculated simpleInterst is " + sI);
	}

	public static void calculateCompoundInterest() {
		/*
		 * P (1 + R/n) (nt) - P Here P is principal amount. R is the annual interest
		 * rate. t is the time the money is invested or borrowed for. n is the number of
		 * times that interest is compounded per unit t,
		 */
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter CI principle value ");
		double p2 = userInput.nextDouble();
		System.out.println("Please enter CI rate value ");
		double r2 = userInput.nextDouble();
		System.out.println("Please enter CI time value ");
		int t2 = userInput.nextInt();
		System.out.println("Please enter CI's number of time , interset need to be compounded");
		int n2 = userInput.nextInt();
		// principal * (Math.pow((1 + rate/100), (time * number))) - principal;
		double cI = p2 * (Math.pow((1 + r2 / 100), (t2 * n2))) - p2;
		System.out.println("Calculated compoundInterst is " + cI);
	}

}
