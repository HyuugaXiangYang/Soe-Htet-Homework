package day_4;

public class ContinueDemo {

	public static void main(String[] args) { //essentially using continue statement to stop using certain "value" or "data" in a loop. but wants the loop to continue
		int i = 0;
		while (i <= 8) {
			
			if(i == 0) { //mathematically impossible to divide by 0. so we want to skip it with continue statement
				i++;
				continue; //if i equals with 0, i is not printed.
			} //end of if
			
			System.out.println(10/i);
			i++;
		} //end of while

	}

}
