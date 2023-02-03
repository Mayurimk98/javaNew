import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mayuri This code help to perform operation like addition,
 *         substraction, multiplication, division also SI and CI calculation
 *
 */
public class calculator {

	public static void main(String[] args) {
		System.out.println("ADDITION CALCULATION");
		calculateAdd();
		System.out.println("SUBSTRACTION CALCULATION");
		calculateSub() ;
		System.out.println("DIVISION CALCULATION");
		calculateDiv();
		System.out.println("MULTIPLICATION CALCULATION");
		calculateMul();
		System.out.println("SIMPLE INTERSET CALCULATION");
		calculateSimpleInterset();
		System.out.println("COMPOUND INTERSET CALCULATION");
		calculateCompoundInterest();
	}

	public static void calculateAdd() {
		Scanner add = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		double number1 = add.nextDouble();
		System.out.println("Please enter 2nd number");
		double number2 = add.nextDouble();
		double addResult = number1 + number2;
		System.out.println("Addition of two number is " + addResult);

	}
	public static void calculateSub() {
		Scanner sub = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		double num1 = sub.nextDouble();
		System.out.println("Please enter 2nd number");
		double num2 = sub.nextDouble();
		double subResult = num1 - num2;
		System.out.println("Substration of two number is " + subResult);

	}
	public static void calculateDiv() {
		Scanner div = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		double num1 = div.nextDouble();
		System.out.println("Please enter 2nd number");
		double num2 = div.nextDouble();
		double divResult = num1 / num2;
		System.out.println("Division of two number is " + divResult);

	}
	public static void calculateMul() {
		Scanner mul = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		double num1 = mul.nextDouble();
		System.out.println("Please enter 2nd number");
		double num2 = mul.nextDouble();
		double mulResult = num1 * num2;
		System.out.println("Substration of two number is " + mulResult);

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
