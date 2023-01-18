package exercise2Package;

import java.util.Scanner;

public class StudentGrade {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter your exam mark below.");
		int stuMark = sc.nextInt(); //make user input their mark
		
		if(stuMark >= 80) {
			System.out.println("Your grade is A"); //print A for mark more than 80
		}
		else if(stuMark < 80 && stuMark >= 65) 
		{
			System.out.println("Your grade is B"); //print B for mark less than 80 and more than 65
		}
		else if(stuMark < 65 && stuMark >= 50) 
		{
			System.out.println("Your grade is C"); //print C for mark less than 65 and more than 50
		}
		else if(stuMark < 50) {
			System.out.println("You fail"); //print fail for mark less than 50
		} //end of if-else if

	}

}
