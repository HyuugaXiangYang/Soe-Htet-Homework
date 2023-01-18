package exercise2Package;

import java.util.Scanner;

public class multiplicationTableExercise {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in); //import scanner class
		System.out.println("Enter a number for you multiplication table below.");
		int inNum = sc.nextInt(); //user input a number
		
		for(int i = 1; i <= 12; i++) { 
			
			int result = i * inNum; //multiplication of user input number with 1 to 12
			
			System.out.println(inNum + " * " + i + " = " + result);
		} //end of for loop

	}

}
