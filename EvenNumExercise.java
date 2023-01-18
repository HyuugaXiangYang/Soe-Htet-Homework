package exercise2Package;

public class EvenNumExercise {

	public static void main(String[] args) {
		
		System.out.print("the even numbers are "); //title
		
		for(int i = 1; i <= 100; i++) { //loop starts with i being 1 and end when i reach 100
			
			if(i % 2 == 0) { //dividing i with 2, if the modulation is zero. the number is even
				System.out.print(i + " ");
			} //end of if
			
		} //end of for loop

	}
}
