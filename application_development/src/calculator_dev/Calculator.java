package calculator_dev;

import java.util.Scanner;

public class Calculator {
	
	public static int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int sub(int number1, int number2) {
		return (number1 - number2);
	}
	
	public static int mul(int number1, int number2) {
		return number1 * number2;
	}
	
	public static int div(int number1, int number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException("Number cannot be divide by 0");
		}
		return number1 / number2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number : ");
		int input1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a Second Number : ");
		int input2 = sc.nextInt();
		
		System.out.println("The Addition is : " + Calculator.add(input1, input2));
		System.out.println("The Substraction is : " + Calculator.sub(input1, input2));
		System.out.println("The Multiplication is : " + Calculator.mul(input1, input2));
		System.out.println("The Division is : " + Calculator.div(input1, input2));
	}
}
