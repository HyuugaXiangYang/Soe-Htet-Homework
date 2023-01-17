package day_4;

public class GrammarWhile {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			
			int x = 0;
			
			try {
				x = Integer.parseInt(args[0]); //cast the length of array into integer
			}catch(Exception e) {
				System.out.println("You must specify a number in the command line.");
			} //set up a range using argument array
			
			int i = 0;
			while (i <= x) { //iterate and print the value of i until it is larger than x
				System.out.println(i);
				i++;
			} //end of while
			
		}else {
			System.out.println("You must specify a number in the command line."); //user need to input the value of the array of argument
		}//end of if

	}

}
