package exercise2Package;
import java.util.Scanner;
public class ColourSwitchExercise {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in); //import scanner class
		
		System.out.println("Enter r, b or g to choose colour.");
		char c1 = sc.next().charAt(0); //input character
		
		switch(c1){
			case 'r': System.out.println("red");
			break;
				
			case 'b': System.out.println("blue");
			break;
			
			case 'g': System.out.println("green");
			break;
			
			default: System.out.println("Only red, blue and green is available.");
		} //end of switch
	}

}
