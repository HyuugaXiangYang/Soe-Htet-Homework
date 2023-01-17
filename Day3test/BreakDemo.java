package day_4;

public class BreakDemo {

	public static void main(String[] args) {
		
		int i = 0;
		boolean b1 = true;
		
		while(b1) {	//while loop start because b1 is true
			if(i == 5) {
				break; //loop will end when i value reach 5.
			} //end of if
			System.out.println(i);
			i++; //print value of i
		} //end of while

	}

}
