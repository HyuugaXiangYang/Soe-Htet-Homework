package day_4;

public class GrammarDo {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			
			int x = Integer.parseInt(args[0]); 
			int i= 0;
			
			do {
				System.out.println(i); //print i whether the condition is true or not
				i++;
			}while(i <= x); //print the value of i as long as x is larger than i
			//end of do-while
			
		} else {
			System.out.println("You must specify a number in the command line.");
		} //end of if-else

	}
}
